package ru.otus.qa.selenium.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.otus.qa.selenium.example.waits.ElementWaits;

public class BasePage {
    // Locators
    private final static String LOGO = ".header2__logo";
    private final WebDriver driver;
    @FindBy(css = LOGO)
    private WebElement elLogo;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public BasePage waitLogoVisible() {
        ElementWaits.waitElementVisible(driver, elLogo);
        return this;
    }
}
