package ru.otus.qa.selenium.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Locale;

public class CoursePage {
    // LOCATORS
    private final static String COURSE_TITLE = ".course-header2__title";
    private final WebDriver driver;
    // WEB_ELEMENTS
    @FindBy(css = COURSE_TITLE)
    private WebElement elCourseTitle;

    // CONSTRUCTOR
    public CoursePage(WebDriver driver) {
        /**
         * Page factory - need to use @FindBy annotations
         */
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public CoursePage checkCourseTitleContainsString(String title) {
        Assert
                .assertTrue(elCourseTitle.getText().toLowerCase(Locale.ROOT).trim().contains(title.toLowerCase(Locale.ROOT).trim()),
                        String.format("Title %s don't contains %s", elCourseTitle.getText(), title));
        return this;
    }
}
