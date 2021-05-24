package com.everis.bdd_gherkin.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {
    private static WebDriver driver;
    public static void acessaSite (String url){
        System.setProperty("webdriver.chrome.driver", "src/test/java/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
