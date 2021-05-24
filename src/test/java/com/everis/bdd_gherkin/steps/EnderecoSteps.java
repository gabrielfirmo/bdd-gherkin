package com.everis.bdd_gherkin.steps;

import com.everis.bdd_gherkin.pages.EnderecoPage;
import io.cucumber.java.pt.E;

public class EnderecoSteps {

    @E("^confirma o endereco de entrega$")
    public void confirmarEndereco(){
        EnderecoPage enderecoPage = new EnderecoPage();
        enderecoPage.confirmarEndereco();
    }

}
