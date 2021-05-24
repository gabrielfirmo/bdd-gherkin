package com.everis.bdd_gherkin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EntregaPage extends BasePage{

    @FindBy(id = "uniform-cgv")
    protected WebElement termoCompromisso;

    @FindBy(name = "processCarrier")
    protected WebElement botaoProsseguirEntrega;

    public EntregaPage(){
        PageFactory.initElements(driver,this);
    }

    public void escolherEntrega() {
        termoCompromisso.click();
        botaoProsseguirEntrega.click();
    }
}
