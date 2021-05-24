package com.everis.bdd_gherkin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EscolhePagamentoPage extends BasePage{

    @FindBy(xpath = "//a[@title='Pay by bank wire']")
    protected WebElement botaoMetodoPagamento;

    public EscolhePagamentoPage(){
        PageFactory.initElements(driver,this);
    }

    public void escolheMetodoPagamento() {
        botaoMetodoPagamento.click();
    }
}
