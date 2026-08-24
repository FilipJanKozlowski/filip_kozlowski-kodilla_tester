package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KodillaStorePom extends AbstractPom {

    @FindBy(id = "searchField")
    WebElement searchField;

    @FindBy(css = "div.element")
    List<WebElement> resultsList;

    public KodillaStorePom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void search(String phrase) {
        searchField.clear();
        searchField.sendKeys(phrase);
    }

    public int getResultsCount() {
        return resultsList.size();
    }
}