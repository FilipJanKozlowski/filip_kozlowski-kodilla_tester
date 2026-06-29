package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroBalanceUponCreation() {

        CashMachine cashMachine = new CashMachine();

        int balance = cashMachine.getBalance();

        assertEquals(0, balance);
    }

    @Test
    public void shouldAddTransactionsAndCalculateBalance() {

        CashMachine cashMachine = new CashMachine();

        cashMachine.addTransaction(500);
        cashMachine.addTransaction(-200);

        assertEquals(2, cashMachine.getTransactionsCount());
        assertEquals(300, cashMachine.getBalance());
    }
}