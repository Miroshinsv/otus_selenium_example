package ru.otus.qa.selenium.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.otus.qa.selenium.example.utils.ScrollUtils;
import ru.otus.qa.selenium.example.waits.ElementWaits;

import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

public class MainPage {
    // LOCATORS
    private final static String COURSE_CONTAINER = ".lessons__new-item-container";
    // ELEMENTS
    @FindBy(css = COURSE_CONTAINER)
    private List<WebElement> elCourses;

    // CONSTRUCTOR
    private final WebDriver driver;
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public MainPage selectCourseByName(String title) {
        WebElement element = elCourses
                .stream()
                .filter((val) -> val.getText().trim().toLowerCase(Locale.ROOT).contains(title.toLowerCase(Locale.ROOT).trim()))
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
        ScrollUtils.scrollToElement(driver, element);
        element.click();
        return this;
    }
}
