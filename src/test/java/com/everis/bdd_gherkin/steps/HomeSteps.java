package com.everis.bdd_gherkin.steps;


import com.everis.bdd_gherkin.pages.HomePage;
import com.everis.bdd_gherkin.utils.Utils;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import org.openqa.selenium.WebDriver;

public class HomeSteps {

    @Dado("^que um usuario acessa o site \"(.*)\"$")
    public void acessarSite(String url){
        Utils.acessaSite(url);
    }

    @E("^pesquisa pelo produto \"(.*)\"$")
    public void pesquisaProduto (String nomeProduto){
        HomePage homePage = new HomePage();
        homePage.pesquisaProduto(nomeProduto);
    }
}
