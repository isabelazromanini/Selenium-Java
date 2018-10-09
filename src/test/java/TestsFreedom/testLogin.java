package TestsFreedom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import MapElementos.telaLogin;
import java.util.concurrent.TimeUnit;


public class testLogin {

    WebDriver driver;


    @BeforeTest(description = "entrar no site")
        public void abreSite() {

            //aqui faz a chamada do driver e abre o site
            System.setProperty("webdriver.chrome.driver","C:\\Users\\romaniis\\IdeaProjects\\meuPrimeiroProjeto\\chrome_driver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("http://clinica-qa.freedom-solutions.com.br/clinica/login");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test (description = "fazer login")
        public void login() {
            //teste do login digita login senha e clica no botao para entrar no sistema

            telaLogin telaLogin = new telaLogin(driver);
            telaLogin.digitaUsuarioCampo("marcos.rodrigues@face.com.br");
            telaLogin.digitaSenhaCampo("123");
            telaLogin.clickBotaoLogin();
    }

}
