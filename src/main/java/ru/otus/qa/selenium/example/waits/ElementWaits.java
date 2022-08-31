package ru.otus.qa.selenium.example.waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementWaits {
    public static WebElement waitElementVisible(WebDriver driver, WebElement element){
        /**
         * Wait element until visible. If element not visible - test will be fail
         * 3 sec - hardcoded
         * ExpectedConditions - libs with implementation waits
         */
        return new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(element));
    }
}
