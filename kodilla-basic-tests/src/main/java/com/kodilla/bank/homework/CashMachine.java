package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;

    public CashMachine() {
        this.transactions = new int[0];
    }

    public void addTransaction(int amount) {
        int[] newTab = new int[this.transactions.length + 1];

        for (int i = 0; i < this.transactions.length; i++) {
            newTab[i] = this.transactions[i];
        }

        newTab[this.transactions.length] = amount;

        this.transactions = newTab;
    }

    public int getBalance() {
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            sum = sum + transactions[i];
        }
        return sum;
    }

    public int getTransactionsCount() {
        return transactions.length;
    }

    public int[] getTransactions() {
        return transactions;
    }
}