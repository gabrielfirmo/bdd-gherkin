package com.everis.bdd_gherkin.steps;

import com.everis.bdd_gherkin.pages.ConfirmaPagamentoPage;
import com.everis.bdd_gherkin.pages.EscolhePagamentoPage;
import io.cucumber.java.pt.Quando;

public class PagamentoSteps {

    @Quando("^o pagamento for confirmado$")
    public void realizarPagamento(){
        EscolhePagamentoPage escolhePagamentoPage = new EscolhePagamentoPage();
        escolhePagamentoPage.escolheMetodoPagamento();

        ConfirmaPagamentoPage confirmaPagamentoPage = new ConfirmaPagamentoPage();
        confirmaPagamentoPage.confirmarPagamento();
    }
}
