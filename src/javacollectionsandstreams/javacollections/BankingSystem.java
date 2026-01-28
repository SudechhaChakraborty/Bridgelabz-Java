package javacollectionsandstreams.javacollections;


import java.util.*;

public class BankingSystem {

    // Helper class for withdrawal request
    static class WithdrawalRequest {
        int accountNumber;
        int amount;

        WithdrawalRequest(int accountNumber, int amount) {
            this.accountNumber = accountNumber;
            this.amount = amount;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1️⃣ HashMap → AccountNumber -> Balance
        Map<Integer, Integer> accounts = new HashMap<>();

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter account number: ");
            int accNo = sc.nextInt();

            System.out.print("Enter balance: ");
            int balance = sc.nextInt();

            accounts.put(accNo, balance);
        }

        // 2️⃣ Queue → Withdrawal requests
        Queue<WithdrawalRequest> queue = new LinkedList<>();

        System.out.print("\nEnter number of withdrawal requests: ");
        int w = sc.nextInt();

        for (int i = 0; i < w; i++) {
            System.out.print("Enter account number and withdrawal amount: ");
            int accNo = sc.nextInt();
            int amount = sc.nextInt();

            queue.add(new WithdrawalRequest(accNo, amount));
        }

        // Process withdrawals
        System.out.println("\n--- Processing Withdrawals ---");
        while (!queue.isEmpty()) {
            WithdrawalRequest req = queue.remove();

            if (accounts.containsKey(req.accountNumber)) {
                int balance = accounts.get(req.accountNumber);

                if (balance >= req.amount) {
                    accounts.put(req.accountNumber, balance - req.amount);
                    System.out.println("Withdrawal successful for Account "
                            + req.accountNumber);
                } else {
                    System.out.println("Insufficient balance for Account "
                            + req.accountNumber);
                }
            } else {
                System.out.println("Account not found: " + req.accountNumber);
            }
        }

        // 3️⃣ TreeMap → Sort customers by balance
        TreeMap<Integer, List<Integer>> sortedByBalance = new TreeMap<>();

        for (Map.Entry<Integer, Integer> entry : accounts.entrySet()) {
            sortedByBalance
                    .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                    .add(entry.getKey());
        }

        System.out.println("\n--- Customers Sorted by Balance (TreeMap) ---");
        for (Map.Entry<Integer, List<Integer>> entry : sortedByBalance.entrySet()) {
            for (int accNo : entry.getValue()) {
                System.out.println("Account: " + accNo +
                        ", Balance: ₹" + entry.getKey());
            }
        }
    }
}
