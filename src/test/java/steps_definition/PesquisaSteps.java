package steps_definition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class PesquisaSteps {

    private WebDriver driver;
    @Dado("^que estou na pagina de pesquisa$")
    public void que_estou_na_pagina_de_pesquisa() throws Throwable {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com.br/");
    }

    @Quando("^pesquisar por um produto \"([^\"]*)\"$")
    public void pesquisar_por_um_produto(String arg1) throws Throwable {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(arg1);
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @Entao("^retorna uma quantidade de produtos$")
    public void retorna_uma_quantidade_de_produtos() throws Throwable {
       String texto = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
        Assert.assertEquals("\"playstation 5\"", texto);
    }

    @Entao("^retorna uma mensagem de erro$")
    public void retorna_uma_mensagem_de_erro() throws Throwable {
        String texto = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[1]/div/div/div/h1/span")).getText();
        Assert.assertEquals("Use menos palavras-chave ou tente usar as a seguir", texto);
    }

    @After (order = 1)
    public void screenshot(Scenario cenario) {
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("target/screenshots/"+cenario.getId()+".jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @After (order = 0)
    public void fecharBrowser() {
        driver.quit();
    }
}
