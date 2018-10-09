package MapElementos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class telaCadastroTipoAtendimento {

    public WebDriver driver;

    private By botaoCadastrarNovo = By.xpath("/html/body/div[2]/div[1]/section[1]/div/a/span");
    private By campoNome = By.name("nome");
    private By campoCorAtendimento = By.name("cor");
    private By botaoSalvar = By.xpath("/html/body/div[2]/div[1]/section[2]/div/div/form/button");

    public telaCadastroTipoAtendimento (WebDriver driver){this.driver = driver;}

    public void clickCadastrarNovo(){driver.findElement(botaoCadastrarNovo).click();}

    public void digitaNome(String campoNomeDigitado){
        driver.findElement(campoNome).clear();
        driver.findElement(campoNome).sendKeys(campoNomeDigitado);
    }

    public void digitaCorAtendimento (){}//ver com o sullivan

    public void clickSalvar (){driver.findElement(botaoSalvar).click();}


}
