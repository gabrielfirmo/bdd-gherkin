package com.everis.bdd_gherkin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(name = "email")
    protected WebElement caixaLogin;

    @FindBy(name = "passwd")
    protected WebElement caixaSenha;

    @FindBy(name = "SubmitLogin")
    protected WebElement botaoLogin;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public void realizarLogin(String email, String senha){
        caixaLogin.sendKeys(email);
        caixaSenha.sendKeys(senha);
        botaoLogin.click();
    }

}
