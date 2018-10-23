package MapElementos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class telaLogin {



    private WebDriver driver;

    private By usuarioCampoLogin = By.name("username") ;
    private By senhaCampoLogin = By.name("password");
    private By botaoLogin = By.xpath("/html/body/div/div[2]/form/div/div/span/button");
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


    public void loginSucesso (String login, String senha){
        /*this.digitaUsuarioCampo (login);
        this.digitaSenhaCampo(senha);
        this.clickBotaoLogin();*/

        driver.findElement(usuarioCampoLogin).clear();
        driver.findElement(usuarioCampoLogin).sendKeys(login);
        driver.findElement(senhaCampoLogin).clear();
        driver.findElement(senhaCampoLogin).sendKeys(senha);
        driver.findElement(botaoLogin).click();
    }

    /*public void mensagemErro() {
        String msgErroExibido;
        String msgErroEsperado;
        msgErroExibido = driver.findElement(erroLogin).getText();
        msgErroEsperado = "O e-mail e/ou senha não conferem";
        Assert.assertEquals(msgErroExibido, msgErroEsperado);
        System.out.println(msgErroExibido);
        System.out.println(msgErroEsperado);

    }*/

    public String mensagemErro() {
        String msgErroEsperado;
        msgErroEsperado = driver.findElement(erroLogin).getText();
        System.out.println(msgErroEsperado);
        return msgErroEsperado;
    }


}
