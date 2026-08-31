package wallet;

public class Wallet {
    private int balance = 0;

    public Wallet() {
    }

    public void deposit(int money) {
        this.balance += money;
    }

    // POCZĄTEK 14.3 - zadanie "Dodajemy scenariusze testowe"
    public void withdraw(int money) {
        this.balance -= money;
    }
    // KONIEC 14.3 - zadanie "Dodajemy scenariusze testowe"

    public int getBalance() {
        return balance;
    }
}