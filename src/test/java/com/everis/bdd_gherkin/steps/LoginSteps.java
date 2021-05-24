package com.everis.bdd_gherkin.steps;

import com.everis.bdd_gherkin.pages.LoginPage;
import io.cucumber.java.pt.E;

public class LoginSteps {

    @E("^realiza o login$")
    public void realizarLogin(){
        LoginPage loginPage = new LoginPage();
        loginPage.realizarLogin("everisbootcamp@qabeginner.com", "QA@everis213");
    }
}
