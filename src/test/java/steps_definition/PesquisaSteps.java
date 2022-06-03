package steps_definition;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PesquisaSteps {
    @Dado("^que estou na pagina de pesquisa$")
    public void que_estou_na_pagina_de_pesquisa() throws Throwable {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com.br/");
    }

    @Quando("^pesquisar por um produto produto \"([^\"]*)\"$")
    public void pesquisar_por_um_produto_produto(String arg1) throws Throwable {

    }

    @Entao("^retorna uma quantidade de produtos$")
    public void retorna_uma_quantidade_de_produtos() throws Throwable {

    }

    @Entao("^aparece uma lista de produtos$")
    public void aparece_uma_lista_de_produtos() throws Throwable {

    }
}
