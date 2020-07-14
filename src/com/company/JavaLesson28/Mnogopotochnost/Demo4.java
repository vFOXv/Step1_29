package com.company.JavaLesson28.Mnogopotochnost;


public class Demo4 extends Object {

    public static void main(String[] args) throws InterruptedException {

    }
}

class Account2 {
    private long balance;

    public Account2() {
        this(0L);
    }

    public Account2(long l) {
        this.setBalance(l);
    }

    public long getBalance() {
        return balance;
    }

    private void setBalance(long balance) {
        this.balance = balance;
    }

    public synchronized void deposit(long amount) {
        checkAmountNonNegative(amount);

        balance += amount;

    }

    private static void checkAmountNonNegative(long amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("negative amount");
        }
    }


    public synchronized void withdraw(long amount) {
        checkAmountNonNegative(amount);

        if (balance < amount) {
            throw new IllegalArgumentException("not enough money");
        }

        balance -= amount;
    }


}