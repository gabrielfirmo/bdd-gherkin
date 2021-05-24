package com.everis.bdd_gherkin.steps;

import com.everis.bdd_gherkin.pages.CheckoutPage;
import io.cucumber.java.pt.E;

public class CheckoutSteps {

    @E("^acessa o checkout$")
    public void acessaCheckout(){
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.prosseguirCheckout();
    }
}
