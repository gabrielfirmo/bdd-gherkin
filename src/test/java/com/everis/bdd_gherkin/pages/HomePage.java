package com.everis.bdd_gherkin.pages;

import com.everis.bdd_gherkin.utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
    @FindBy(css = "#search_query_top")
    protected WebElement campoBusca;

    @FindBy(name = "submit_search")
    protected WebElement botaoLupaBuscar;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    public void pesquisaProduto(String nomeProduto) {
        campoBusca.sendKeys(nomeProduto);
        botaoLupaBuscar.click();
    }
}
