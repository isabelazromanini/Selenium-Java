package TesteQualidade;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class elementosPagina {


    private WebDriver driver;
    private By usuarioCampoLogin = By.id("login-email") ;
    private By senhaCampoLogin = By.id("login-password");
    private By botaoLogin = By.name("login[submit]");
    public By usuarioSucesso = By.xpath("//*[@id=\"header\"]/nav/div/div/ul/li[3]/a/span");

    public elementosPagina(WebDriver driver){
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



    public String loginSucesso(){
        String usuarioLogado;
        usuarioLogado = driver.findElement(usuarioSucesso).getText();
        return usuarioLogado;

    }




}
