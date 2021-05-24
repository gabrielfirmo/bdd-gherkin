package com.everis.bdd_gherkin.steps;

import com.everis.bdd_gherkin.pages.PedidoCompletoPage;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class PedidoCompletoSteps {

    @Entao("^deve ser apresentado a mensagem \"(.*)\"$")
    public void confirmacaoPedido(String pedidoCompleto){
        PedidoCompletoPage pedidoCompletoPage = new PedidoCompletoPage();
        String validaTexto = pedidoCompletoPage.getValidaTexto().getText();

        Assert.assertEquals(pedidoCompleto, validaTexto);
    }
}
