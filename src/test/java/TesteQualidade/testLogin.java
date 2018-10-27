package TesteQualidade;

import MapElementos.telaLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import TesteQualidade.elementosPagina;
import java.util.concurrent.TimeUnit;

public class testLogin {
    WebDriver driver;

    @BeforeTest(description = "entrar no site")
    public void abreSite() {

        //aqui faz a chamada do driver e abre o site
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\romaniis\\IdeaProjects\\meuPrimeiroProjeto\\chrome_driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://psel-app.arquivei.com.br/index/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test  (description = "teste login sucesso",priority=1)
    public void login() {
        //teste do login digita login senha e clica no botao para entrar no sistema

        elementosPagina elementosPagina = new elementosPagina(driver);
        elementosPagina.digitaUsuarioCampo("bella_zr@hotmail.com");
        elementosPagina.digitaSenhaCampo("mudar123");
        elementosPagina.clickBotaoLogin();
        Assert.assertEquals("bella_zr@hotmail.com",elementosPagina.loginSucesso());
    }



    @AfterTest(description = "encerrar navegador")
    public void setupFinal (){
        driver.quit();
    }


}
