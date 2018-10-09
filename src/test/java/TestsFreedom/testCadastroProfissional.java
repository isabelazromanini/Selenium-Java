package TestsFreedom;


import MapElementos.telaLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import MapElementos.telaCadastroProfissional;
import MapElementos.telaHome;
import MapElementos.telaLogin;
import java.util.concurrent.TimeUnit;

public class testCadastroProfissional {
    WebDriver driver;


    @BeforeTest(description = "entrar no site")
    public void test1() {
        @BeforeTest(description = "entrar no site")
        public void abrirSite () {

            //aqui faz a chamada do driver e abre o site
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\romaniis\\IdeaProjects\\meuPrimeiroProjeto\\chrome_driver\\chromedriver.exe");
            driver = new ChromeDriver();
            telaLogin telaLogin = new telaLogin(driver);
            driver.get("http://clinica-qa.freedom-solutions.com.br/clinica/login");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            telaLogin.digitaUsuarioCampo("marcos.rodrigues@face.com.br");
            telaLogin.digitaSenhaCampo("123");
            telaLogin.clickBotaoLogin();
        }

        @Test(description = "fazer login")
        public void cadastroProfissional () {
            telaCadastroProfissional telaCadastroProfissional = new telaCadastroProfissional(driver);


        }

    }
}


