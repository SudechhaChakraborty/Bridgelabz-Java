package javacollectionsandstreams.javacollections;

import java.util.*;
import java.time.LocalDate;

// Policy class (helper, NOT public)
class Policy {
    int policyNumber;
    String holderName;
    LocalDate expiryDate;
    String coverageType;
    double premium;

    Policy(int policyNumber, String holderName,
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

// Main class
public class InsurancePolicyManagement {

    static Map<Integer, Policy> hashMap = new HashMap<>();
    static Map<Integer, Policy> linkedHashMap = new LinkedHashMap<>();
    static TreeMap<LocalDate, List<Policy>> treeMap = new TreeMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

            Policy p = new Policy(num, name, date, type, premium);

            hashMap.put(num, p);
            linkedHashMap.put(num, p);

            treeMap.computeIfAbsent(date, d -> new ArrayList<>()).add(p);
        }

        // 1️⃣ Retrieve by policy number
        System.out.print("\nEnter policy number to search: ");
        int search = sc.nextInt();
        System.out.println(hashMap.getOrDefault(search, null));

        // 2️⃣ Policies expiring within 30 days
        System.out.println("\nPolicies expiring within 30 days:");
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        for (LocalDate d : treeMap.keySet()) {
            if (!d.isBefore(today) && !d.isAfter(limit)) {
                for (Policy p : treeMap.get(d))
                    System.out.println(p);
            }
        }

        // 3️⃣ Policies by policyholder
        System.out.print("\nEnter policyholder name: ");
        String holder = sc.next();

        System.out.println("Policies for " + holder + ":");
        for (Policy p : hashMap.values()) {
            if (p.holderName.equalsIgnoreCase(holder)) {
                System.out.println(p);
            }
        }

        // 4️⃣ Remove expired policies
        System.out.println("\nRemoving expired policies...");
        hashMap.values().removeIf(p -> p.expiryDate.isBefore(today));
        linkedHashMap.values().removeIf(p -> p.expiryDate.isBefore(today));
        treeMap.headMap(today).clear();

        System.out.println("Remaining policies:");
        for (Policy p : linkedHashMap.values()) {
            System.out.println(p);
        }
    }
}
