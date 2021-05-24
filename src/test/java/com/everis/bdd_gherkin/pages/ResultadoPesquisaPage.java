package com.everis.bdd_gherkin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultadoPesquisaPage extends BasePage{

    @FindBy(xpath = "//*[text()='Add to cart']")
    protected WebElement botaoAdicionarAoCarrinho;

    @FindBy(css = "[title='Proceed to checkout']")
    protected WebElement botaoProsseguir;

    public ResultadoPesquisaPage() {
        PageFactory.initElements(driver, this);
    }

    public void adicionarProdutoAoCarrinho(String nomeProduto) {
        WebElement nomeProdutoTela = driver.findElement(By.cssSelector("h5[itemprop='name'] a[title='" + nomeProduto
                + "']"));
        moveToElement(nomeProdutoTela);
        botaoAdicionarAoCarrinho.click();
        waitElement(botaoProsseguir, 10).click();

    }
}
