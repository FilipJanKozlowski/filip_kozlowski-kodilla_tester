package wallet;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    // POCZĄTEK 14.3 - zadanie "Dodajemy scenariusze testowe"
    private Exception thrownException;
    // KONIEC 14.3 - zadanie "Dodajemy scenariusze testowe"

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
    }

    // POCZĄTEK MODYFIKACJI 14.3 - zadanie "Dodajemy scenariusze testowe" (w teorii: i_request_$30() na sztywno dla $30)
    @When("I request ${int}")
    public void i_request_amount(Integer amount) {
        requestWithdrawal(amount);
    }
    // KONIEC MODYFIKACJI 14.3 - zadanie "Dodajemy scenariusze testowe"

    // POCZĄTEK 14.3 - zadanie "Dodajemy scenariusze testowe"
    @When("I request -${int}")
    public void i_request_negative_amount(Integer amount) {
        requestWithdrawal(-amount);
    }

    private void requestWithdrawal(int amount) {
        thrownException = null;
        try {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, amount);
        } catch (IllegalArgumentException e) {
            thrownException = e;
        }
    }
    // KONIEC 14.3 - zadanie "Dodajemy scenariusze testowe"

    // POCZĄTEK MODYFIKACJI 14.3 - zadanie "Dodajemy scenariusze testowe" (w teorii: $30_should_be_dispensed() na sztywno dla $30)
    @Then("${int} should be dispensed")
    public void amount_should_be_dispensed(Integer amount) {
        Assert.assertEquals((int) amount, cashSlot.getContents());
    }
    // KONIEC MODYFIKACJI 14.3 - zadanie "Dodajemy scenariusze testowe"

    // POCZĄTEK 14.3 - zadanie "Dodajemy scenariusze testowe"
    @Then("the withdrawal should be rejected")
    public void the_withdrawal_should_be_rejected() {
        Assert.assertNotNull("Expected the withdrawal to be rejected", thrownException);
    }

    @And("my wallet balance should be ${int}")
    public void my_wallet_balance_should_be(Integer amount) {
        Assert.assertEquals((int) amount, wallet.getBalance());
    }

    @And("my wallet balance should remain ${int}")
    public void my_wallet_balance_should_remain(Integer amount) {
        Assert.assertEquals((int) amount, wallet.getBalance());
    }
    // KONIEC 14.3 - zadanie "Dodajemy scenariusze testowe"

    // POCZĄTEK zadanie finalne modułu 14 - "Automatyzacja scenariuszy testowych"
    @Given("there is ${int} in my wallet")
    public void there_is_amount_in_my_wallet(Integer amount) {
        wallet.deposit(amount);
        Assert.assertEquals("Incorrect wallet balance", (int) amount, wallet.getBalance());
    }

    @When("I withdraw ${int}")
    public void i_withdraw_amount(Integer amount) {
        requestWithdrawal(amount);
    }

    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        Assert.assertEquals(0, cashSlot.getContents());
    }

    @And("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_insufficient_funds() {
        Assert.assertNotNull("Expected an insufficient funds error", thrownException);
    }

    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
    }

    @Then("I should see that the balance is ${int}")
    public void i_should_see_that_the_balance_is(Integer amount) {
        Assert.assertEquals((int) amount, wallet.getBalance());
    }
    // KONIEC zadanie finalne modułu 14 - "Automatyzacja scenariuszy testowych"
}