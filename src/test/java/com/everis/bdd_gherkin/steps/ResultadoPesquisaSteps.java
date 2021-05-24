package com.everis.bdd_gherkin.steps;

import com.everis.bdd_gherkin.pages.BasePage;
import com.everis.bdd_gherkin.pages.ResultadoPesquisaPage;
import com.everis.bdd_gherkin.utils.Utils;
import io.cucumber.java.pt.E;
import org.openqa.selenium.WebDriver;

public class ResultadoPesquisaSteps extends BasePage {

    @E("^adiciona o produto \"(.*)\" ao carrinho$")
    public void adicionarProdutoAoCarrinho(String nomeProduto){
        ResultadoPesquisaPage resultadoPesquisaPage = new ResultadoPesquisaPage();
        resultadoPesquisaPage.adicionarProdutoAoCarrinho(nomeProduto);
    }


}
