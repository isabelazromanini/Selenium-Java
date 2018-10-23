package MapElementos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class telaHome {
        private WebDriver driver;

        private By cadastro = By.xpath("/html/body/div[2]/aside/section/ul/li[5]/a/span[1]");
        private By cadastroPaciente = By.xpath("/html/body/div[2]/aside/section/ul/li[5]/ul/li[3]/a");
        private By cadastroProfissional = By.xpath("/html/body/div[2]/aside/section/ul/li[5]/ul/li[2]/a");
        private By cadastroTipoAtendimento = By.xpath("/html/body/div[2]/aside/section/ul/li[5]/ul/li[6]/a");
        private By atendimento = By.xpath("/html/body/div[2]/aside/section/ul/li[3]/a/span[2]");
        private By atendimentoAgenda = By.xpath("/html/body/div[2]/aside/section/ul/li[3]/ul/li[1]/a");


        public telaHome(WebDriver driver){
                this.driver = driver;
        }

        public void clickCadastro(){ driver.findElement(cadastro).click();}
        public void clickCadastroPaciente (){driver.findElement(cadastroPaciente).click();}
        public void clickCadastroProfissional(){driver.findElement(cadastroProfissional).click();}
        public void clickAtendimento(){driver.findElement(atendimento).click();}
        public void clickAtendimentoAgenda(){driver.findElement(atendimentoAgenda).click();}
        public void clickCadastroTipoAtendimeto(){driver.findElement(cadastroTipoAtendimento).click();}

}
