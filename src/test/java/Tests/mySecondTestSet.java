package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//1. logar no site da marmita
//1. acessar o site da marmita
//2. clicar no botao do menu superior Entra
//3. limpar os campos login e senha
//4. preencher login e senha e clicar no entrar
//5. fazer a busca por Comida japonesa *filtro checkbox*  e clicar Filtrar

public class mySecondTestSet {


 /*   @Test//(description = "fazerLogin)
    public  void test1(){

        WebElement BottonLogin = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul[2]/li/a"));
        BottonLogin.click();

        WebElement usuario = driver.findElement(By.name("loginPanel:email"));
        usuario.clear();
        WebElement senha = driver.findElement((By.name("loginPanel:senha")));
        senha.clear();

        usuario.sendKeys("bella_zr@hotmail.com");
        senha.sendKeys("Bella@412861");

        WebElement bottonAcessar = driver.findElement(By.name("loginPanel:acessar"));
        bottonAcessar.click();

        WebElement selecionarEndereco = driver.findElement(By.xpath("//*[@id=\"idd\"]"));
        selecionarEndereco.click();

        WebElement filtroJaponesa = driver.findElement(By.xpath("/html/body/form/section[2]/div/div/div[2]/div[3]/div[1]/div[2]/ul/li[3]/label/span"));
        filtroJaponesa.click();

        WebElement filtrar = driver.findElement(By.id("id3e"));
        filtrar.click();


    }
*/
    @Test (description = "loginInvalido")
    public void test2(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\romaniis\\IdeaProjects\\meuPrimeiroProjeto\\Browser_Drivers\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
        // WebDriver driver = new ChromeDriver();
        driver.get("https://fazpedidos.com.br/");


        WebElement BottonLogin = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul[2]/li/a"));
        BottonLogin.click();

        WebElement usuario = driver.findElement(By.name("loginPanel:email"));
        usuario.clear();
        WebElement senha = driver.findElement((By.name("loginPanel:senha")));
        senha.clear();

        usuario.sendKeys("joao@joao.com");
        senha.sendKeys("Bella@412861");

        WebElement bottonAcessar = driver.findElement(By.name("loginPanel:acessar"));
        bottonAcessar.click();


        WebElement elementoErro = driver.findElement(By.xpath("/html/body/form/div[2]/div[1]/div[1]/div/div"));

        String msgErroExibido = elementoErro.getText();

       // String msgErroEsperado = "Login e/ou Senha inválidos.";
        String msgErroEsperado = "Login e/ou Senha inválidos.";
        Assert.assertEquals(msgErroExibido, msgErroEsperado);
        System.out.println(msgErroExibido);
        System.out.println(msgErroEsperado);
    }

}

//public void setErroLogin(By novoErroLogin){
//  erroLogin = novoErroLogin;
//}

//public By getErroLogin(){
//    return erroLogin;
// }
//

