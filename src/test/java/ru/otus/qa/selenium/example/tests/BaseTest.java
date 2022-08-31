package ru.otus.qa.selenium.example.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.otus.qa.selenium.example.factory.WebDriverFactory;
import ru.otus.qa.selenium.example.utils.EnvUtils;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        driver = WebDriverFactory.initDriver(EnvUtils.getEnv("browser").orElse("Chrome"));
        driver.get("https://otus.ru");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
