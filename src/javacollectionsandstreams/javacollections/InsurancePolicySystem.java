package javacollectionsandstreams.javacollections;

import java.util.*;
import java.time.LocalDate;

// Helper class (renamed to avoid duplicate)
class InsurancePolicyData {
    int policyNumber;
    String holderName;
    LocalDate expiryDate;
    String coverageType;
    double premium;

    InsurancePolicyData(int policyNumber, String holderName,
                        LocalDate expiryDate, String coverageType, double premium) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premium = premium;
    }

    @Override
    public String toString() {
        return policyNumber + " | " + holderName + " | " +
                coverageType + " | Expiry: " + expiryDate +
                " | Premium: " + premium;
    }
}

// ONE public class
public class InsurancePolicySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<Integer, InsurancePolicyData> hashMap = new HashMap<>();
        Map<Integer, InsurancePolicyData> linkedHashMap = new LinkedHashMap<>();
        TreeMap<LocalDate, List<InsurancePolicyData>> treeMap = new TreeMap<>();

        System.out.print("Enter number of policies: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter policy details:");
            System.out.print("Policy Number: ");
            int num = sc.nextInt();

            System.out.print("Policyholder Name: ");
            String name = sc.next();

            System.out.print("Expiry Date (YYYY-MM-DD): ");
            LocalDate date = LocalDate.parse(sc.next());

            System.out.print("Coverage Type: ");
            String type = sc.next();

            System.out.print("Premium Amount: ");
            double premium = sc.nextDouble();

            InsurancePolicyData p =
                    new InsurancePolicyData(num, name, date, type, premium);

            hashMap.put(num, p);
            linkedHashMap.put(num, p);
            treeMap.computeIfAbsent(date, d -> new ArrayList<>()).add(p);
        }

        // Retrieve by policy number
        System.out.print("\nEnter policy number to search: ");
        int search = sc.nextInt();
        System.out.println(hashMap.getOrDefault(search, null));

        // Policies expiring in next 30 days
        System.out.println("\nPolicies expiring within 30 days:");
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        for (LocalDate d : treeMap.keySet()) {
            if (!d.isBefore(today) && !d.isAfter(limit)) {
                for (InsurancePolicyData p : treeMap.get(d)) {
                    System.out.println(p);
                }
            }
        }

        // Policies by policyholder
        System.out.print("\nEnter policyholder name: ");
        String holder = sc.next();

        System.out.println("Policies for " + holder + ":");
        for (InsurancePolicyData p : hashMap.values()) {
            if (p.holderName.equalsIgnoreCase(holder)) {
                System.out.println(p);
            }
        }

        // Remove expired policies
        System.out.println("\nRemoving expired policies...");
        hashMap.values().removeIf(p -> p.expiryDate.isBefore(today));
        linkedHashMap.values().removeIf(p -> p.expiryDate.isBefore(today));
        treeMap.headMap(today).clear();

        System.out.println("\nRemaining policies:");
        for (InsurancePolicyData p : linkedHashMap.values()) {
            System.out.println(p);
        }
    }
}
