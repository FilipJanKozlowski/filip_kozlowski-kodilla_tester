package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldCalculateGlobalBankMetrics() {
        Bank bank = new Bank();

        CashMachine cm1 = new CashMachine();
        cm1.addTransaction(1000);
        cm1.addTransaction(-200);

        CashMachine cm2 = new CashMachine();
        cm2.addTransaction(500);
        cm2.addTransaction(-100);
        cm2.addTransaction(-50);

        bank.addCashMachine(cm1);
        bank.addCashMachine(cm2);

        assertEquals(1150, bank.getTotalBalance());
        assertEquals(2, bank.getDepositsCount());
        assertEquals(3, bank.getWithdrawalsCount());

        assertEquals(750.0, bank.getAverageDeposit(), 0.001);

        assertEquals(-116.66, bank.getAverageWithdrawal(), 0.01);
    }
}