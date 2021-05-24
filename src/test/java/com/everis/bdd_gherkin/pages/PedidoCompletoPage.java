package com.everis.bdd_gherkin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PedidoCompletoPage extends BasePage{

    @FindBy(css = "#center_column > div > p > strong")
    protected WebElement validaTexto;

    public PedidoCompletoPage(){
        PageFactory.initElements(driver,this);
    }

    public WebElement getValidaTexto() {
        return validaTexto;
    }
}
