package wallet;

public class Cashier {
    private final CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        // POCZĄTEK 14.3 - zadanie "Dodajemy scenariusze testowe"
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > wallet.getBalance()) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        wallet.withdraw(amount);
        // KONIEC 14.3 - zadanie "Dodajemy scenariusze testowe"
        cashSlot.dispense(amount);
    }
}