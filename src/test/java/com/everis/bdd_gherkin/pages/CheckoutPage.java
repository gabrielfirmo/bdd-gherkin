package com.everis.bdd_gherkin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends BasePage{

    @FindBy(css = "a[class='button btn btn-default standard-checkout button-medium'] span")
    protected WebElement botaoProsseguirCarrinho;

    public CheckoutPage(){
        PageFactory.initElements(driver,this);
    }

    public void prosseguirCheckout() {
        botaoProsseguirCarrinho.click();
    }
}
