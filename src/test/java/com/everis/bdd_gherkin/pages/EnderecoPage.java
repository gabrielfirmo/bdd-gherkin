package com.everis.bdd_gherkin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnderecoPage extends BasePage{

    @FindBy(name = "processAddress")
    protected WebElement botaoProsseguirEndereco;

    public EnderecoPage(){
        PageFactory.initElements(driver,this);
    }

    public void confirmarEndereco() {
        botaoProsseguirEndereco.click();
    }

}
