package com.everis.bdd_gherkin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmaPagamentoPage extends BasePage{

    @FindBy(xpath = "//span[normalize-space()='I confirm my order']")
    protected WebElement botaoConfirmaPedido;

    public ConfirmaPagamentoPage(){
        PageFactory.initElements(driver, this);
    }

    public void confirmarPagamento(){
        botaoConfirmaPedido.click();
    }


}
