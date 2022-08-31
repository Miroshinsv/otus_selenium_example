package ru.otus.qa.selenium.example.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.otus.qa.selenium.example.pages.CoursePage;
import ru.otus.qa.selenium.example.pages.MainPage;

public class Test001CheckCourseTitle extends BaseTest {
    private MainPage mainPage;
    private CoursePage coursePage;

    @BeforeMethod
    public void setUpTest() {
        mainPage = new MainPage(driver);
        coursePage = new CoursePage(driver);
    }

    @Test
    public void test01() {
        mainPage
                .selectCourseByName("PHP");
        coursePage
                .checkCourseTitleContainsString("PHP");
    }
}
