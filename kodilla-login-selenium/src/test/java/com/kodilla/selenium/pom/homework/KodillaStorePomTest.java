package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KodillaStorePomTest {

    WebDriver driver;
    KodillaStorePom storePom;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");
        storePom = new KodillaStorePom(driver);
    }

    @ParameterizedTest
    @CsvSource({
            "NoteBook, 2",
            "School, 1",
            "Brand, 1",
            "Business, 0",
            "Gaming, 1",
            "Powerful, 0"
    })
    public void testStorePage_CheckResultsCount(String phrase, int expectedCount) {
        storePom.search(phrase);

        int actualCount = storePom.getResultsCount();

        assertEquals(expectedCount, actualCount);
    }

    @ParameterizedTest
    @CsvSource({
            "NoteBook, notebook",
            "School, SCHOOL",
            "Gaming, gAmInG"
    })
    public void testStorePage_CheckCaseInsensitivity(String originalPhrase, String differentCasePhrase) {
        storePom.search(originalPhrase);
        int originalCount = storePom.getResultsCount();

        storePom.search(differentCasePhrase);
        int differentCaseCount = storePom.getResultsCount();

        assertEquals(originalCount, differentCaseCount);
    }

    @AfterEach
    public void tearDown() {
        driver.close();
    }
}