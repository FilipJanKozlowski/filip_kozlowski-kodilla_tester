package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://allegro.pl/");

        Thread.sleep(10000);

        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
        }

        WebElement categoryCombo = driver.findElement(By.xpath("//select[@data-role=\"search-scope-select\"]"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByVisibleText("Elektronika");

        WebElement searchField = driver.findElement(By.xpath("//input[@data-role=\"search-input\"]"));
        searchField.sendKeys("Mavic mini");

        WebElement searchButton = driver.findElement(By.xpath("//button[@data-role=\"search-button\"]"));
        searchButton.click();
    }
}