package ru.otus.qa.selenium.example.utils;

import java.util.Optional;

/**
 * This class need to get env. Env will be configure on CI/CD.
 * To local need add property
 */
public class EnvUtils {

    public static Optional<String> getEnv(String envName) {
        return Optional.ofNullable(System.getenv(envName));
    }
}
