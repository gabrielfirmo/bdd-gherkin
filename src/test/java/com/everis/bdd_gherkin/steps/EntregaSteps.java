package com.everis.bdd_gherkin.steps;

import com.everis.bdd_gherkin.pages.EnderecoPage;
import com.everis.bdd_gherkin.pages.EntregaPage;
import io.cucumber.java.pt.E;

public class EntregaSteps {

    @E("^escolhe a forma de transporte$")
    public void escolherEntrega(){
        EntregaPage entregaPage = new EntregaPage();
        entregaPage.escolherEntrega();
    }
}
