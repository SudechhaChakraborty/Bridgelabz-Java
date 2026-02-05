package javaregexandjunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccount {

    private double balance = 0;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

class BankAccountTest {

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        assertEquals(1000, account.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(400);
        assertEquals(600, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount();
        assertThrows(IllegalArgumentException.class,
                () -> account.withdraw(500));
    }
}
