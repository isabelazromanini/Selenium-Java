package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class myFirstTestSet {


    @Test(description = "novo usuario")
    public static void test1() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\romaniis\\IdeaProjects\\meuPrimeiroProjeto\\Browser_Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.juliodelima.com.br/taskit/");

        WebElement cadastro = driver.findElement(By.id("signup"));
        cadastro.click();

        WebElement nome = driver.findElement(By.name("name"));
        nome.sendKeys("Isabela");

        WebElement login = driver.findElement(By.name("login"));
        login.sendKeys("teste@teste.com");

        WebElement senha = driver.findElement(By.name("password"));
        senha.sendKeys("testeteste");

        WebElement save = driver.findElement(By.xpath("//*[@id=\"signupbox\"]/div[2]/a"));
        save.click();

        //fecha o navegador
        //driver.close();

    }


}