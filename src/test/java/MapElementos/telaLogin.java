package MapElementos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class telaLogin {

    private WebDriver driver;

    private By usuarioCampoLogin = By.name("username") ;
    private By senhaCampoLogin = By.name("password");
    private By botaoLogin = By.xpath("/html/body/div/div[2]/form/div/div/span/button/text()");
    public  By erroLogin = By.xpath("/html/body/div/div[2]");

    public telaLogin(WebDriver driver){
        this.driver = driver;
    }


    public void clickBotaoLogin(){
        driver.findElement(botaoLogin).click();
    }


    public void digitaUsuarioCampo(String usuarioCampoDigitado){
        driver.findElement(usuarioCampoLogin).clear();
        driver.findElement(usuarioCampoLogin).sendKeys(usuarioCampoDigitado);

    }

    public void digitaSenhaCampo (String senhaCampoDigitado){
        driver.findElement(senhaCampoLogin).clear();
        driver.findElement(senhaCampoLogin).sendKeys(senhaCampoDigitado);
    }

}
