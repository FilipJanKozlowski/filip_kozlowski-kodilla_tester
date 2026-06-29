package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

    public Bank() {
        this.cashMachines = new CashMachine[0];
    }

    public void addCashMachine(CashMachine cashMachine) {
        CashMachine[] newTab = new CashMachine[this.cashMachines.length + 1];
        for (int i = 0; i < this.cashMachines.length; i++) {
            newTab[i] = this.cashMachines[i];
        }
        newTab[this.cashMachines.length] = cashMachine;
        this.cashMachines = newTab;
    }

    public int getTotalBalance() {
        int total = 0;
        for (CashMachine cm : cashMachines) {
            total += cm.getBalance();
        }
        return total;
    }

    public int getWithdrawalsCount() {
        int count = 0;
        for (CashMachine cm : cashMachines) {
            for (int transaction : cm.getTransactions()) {
                if (transaction < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public int getDepositsCount() {
        int count = 0;
        for (CashMachine cm : cashMachines) {
            for (int transaction : cm.getTransactions()) {
                if (transaction > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public double getAverageWithdrawal() {
        if (this.getWithdrawalsCount() == 0) {
            return 0.0;
        }

        double sum = 0;
        for (CashMachine cm : cashMachines) {
            for (int transaction : cm.getTransactions()) {
                if (transaction < 0) {
                    sum += transaction;
                }
            }
        }
        return sum / this.getWithdrawalsCount();
    }

    public double getAverageDeposit() {
        if (this.getDepositsCount() == 0) {
            return 0.0;
        }

        double sum = 0;
        for (CashMachine cm : cashMachines) {
            for (int transaction : cm.getTransactions()) {
                if (transaction > 0) {
                    sum += transaction;
                }
            }
        }
        return sum / this.getDepositsCount();
    }
}