package TestsFreedom;


import MapElementos.telaLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import MapElementos.telaCadastroProfissional;
import MapElementos.telaHome;
import MapElementos.telaLogin;
import java.util.concurrent.TimeUnit;


public class testCadastroProfissional {
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

        @Test(description = "fazer login teste")
        public void cadastroProfissional () {
            telaHome telaHome = new telaHome(driver);
            telaHome.clickCadastro();
            telaHome.clickCadastroProfissional();

            telaCadastroProfissional telaCadastroProfissional = new telaCadastroProfissional(driver);
            telaCadastroProfissional.clickBotaoAdicionarProfissional();
            telaCadastroProfissional.digitaCampoNome("Isabela Teste Teste");
            telaCadastroProfissional.digitaCampoQuantidadeRetorno("3");
            telaCadastroProfissional.associarUsuario("Elivelton Repolho");
            telaCadastroProfissional.clickUsuarioEspecifico();
            telaCadastroProfissional.digitaDiaSemana("Segunda-feira");
            telaCadastroProfissional.digitaDiaSemana("Terça-feira");
            telaCadastroProfissional.digitaDiaSemana("Quarta-feira");
            telaCadastroProfissional.digitaHoraInicio("09:00");
            telaCadastroProfissional.digitaHoraFim("18:00");
            telaCadastroProfissional.clickDiaJornadaEspecifico();
            telaCadastroProfissional.clickJornadaAdicionar();
            telaCadastroProfissional.digitaCampoAtendimento("BOTOX");
            telaCadastroProfissional.digitaTempoAtendimento("01:00");
            telaCadastroProfissional.digitaValorAtendimento("10,00");
            telaCadastroProfissional.clickBotaoAssociar();
            telaCadastroProfissional.digitaCampoConvenio("Unimed");
            telaCadastroProfissional.digitaMaximaDia("5");
            telaCadastroProfissional.clickAssociarConvenio();
            telaCadastroProfissional.clickSalvarProfissional();



    }

    }



