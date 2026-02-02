package javacollectionsandstreams.javaexceptions;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class BankAccount {
    double balance = 5000;

    void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount < 0)
            throw new IllegalArgumentException("Invalid amount!");

        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient balance!");

        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

public class BankTransactionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        try {
            acc.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}