package TestsFreedom;

import MapElementos.telaLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import MapElementos.telaCadastroTipoAtendimento;
import java.util.concurrent.TimeUnit;

public class testCadastroTipoAtendimento {
    WebDriver driver;

        @BeforeTest (description = "inicializar sistema")
             public void setUp (){
             System.setProperty("webdriver.chrome.driver", "C:\\Users\\romaniis\\IdeaProjects\\meuPrimeiroProjeto\\chrome_driver\\chromedriver.exe");
             driver = new ChromeDriver();
             driver.get("http://clinica-qa.freedom-solutions.com.br/clinica/login");
             driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }

        @BeforeMethod(description = "entrar no site")
            public void abrirSite () {
            telaLogin telaLogin = new telaLogin(driver);
            telaLogin.loginSucesso("marcos.rodrigues@face.com.br","123");

        }

        @Test (description = "teste cadastro de tipo de atendimento")
            public void cadastroTipoAtendimento(){
            telaCadastroTipoAtendimento telaCadastroTipoAtendimento = new telaCadastroTipoAtendimento(driver);
            
        }
}
