package com.everis.bdd_gherkin.pages;

import com.everis.bdd_gherkin.utils.Utils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class BasePage {
    protected static WebDriver driver = Utils.getDriver();

    protected void moveToElement(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
    }

    protected WebElement waitElement(WebElement webElement, int timeOutInSeconds) {
        @SuppressWarnings("deprecation")
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(timeOutInSeconds, TimeUnit.SECONDS)
                .pollingEvery(10, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class).ignoring(ElementNotVisibleException.class);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(webElement));
        return element;
    }
}
