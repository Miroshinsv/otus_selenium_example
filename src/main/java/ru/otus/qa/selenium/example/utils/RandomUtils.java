package ru.otus.qa.selenium.example.utils;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class RandomUtils {

    /**
     * Get random element from list
     *
     * @param elementList
     * @return
     */
    public static WebElement selectRandomElementFromList(List<WebElement> elementList) {
        return elementList.get(new Random().nextInt(elementList.size()));
    }
}
