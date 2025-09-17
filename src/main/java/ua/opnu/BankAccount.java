package ua.opnu;

public class BankAccount {
    String name;
    double balance;
    double transactionFee;

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount - transactionFee;
        }
    }

    double getBalance() {
        return this.balance;
    }

    boolean withdraw(double amount) {
        if ((amount > 0) && (balance > amount + transactionFee)) {
            balance = balance - amount - transactionFee;
            return true;
        }
        return false;
    }

    boolean transfer(BankAccount receiver, double amount) {
        if ((amount > 0 + this.transactionFee) && (getBalance() >= amount + this.transactionFee)) {
            this.balance = getBalance() - amount - this.transactionFee;
            receiver.balance += amount;
            return true;
        }
        return false;
    }
}