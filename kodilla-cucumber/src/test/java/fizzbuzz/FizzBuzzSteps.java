package fizzbuzz;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static fizzbuzz.FizzBuzz.check;

public class FizzBuzzSteps {
    private int number;
    private String answer;

    @Given("liczba to {int}")
    public void liczba_to(Integer int1) {
        this.number = int1;
    }

    @When("sprawdzam wynik FizzBuzz")
    public void sprawdzam_wynik_fizz_buzz() {
        this.answer = check(this.number);
    }

    @Then("powinienem otrzymać {string}")
    public void powinienem_otrzymać(String string) {
        assertEquals(string, this.answer);
    }
}