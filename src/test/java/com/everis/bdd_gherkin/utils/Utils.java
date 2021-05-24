package com.everis.bdd_gherkin.utils;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {
    private static WebDriver driver;
    public static void acessaSite (String url){
        System.setProperty("webdriver.chrome.driver", "src/test/java/resources/chromedriver");
        driver = new ChromeDriver();
        //driver.manage().window().setPosition(new Point(2560,0));
        driver.manage().window().maximize();
        driver.get(url);
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
