package MapElementos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class telaCadastroProfissional {

    public WebDriver driver;

    private By botaoAdicionarProfissional = By.xpath("/html/body/div[2]/div[1]/section[1]/div/a");
    private By campoNome = By.name("nome");
    private By campoQuantidadeRetorno = By.id("maxRetornoDia");
    private By campoAssociarUsuario = By.xpath("//*[@id=\"usuario\"]");
    private By botaoUsuarioCompartilhado = By.xpath("//*[@id=\"formProfissional\"]/div[1]/div[2]/div[4]/div/div/div/span[1]");
    private By botaoUsuarioEspecifico = By.xpath("//*[@id=\"formProfissional\"]/div[1]/div[2]/div[4]/div/div/div/span[3]");
    private By campoDiaSemana = By.xpath("//*[@id=\"formProfissional\"]/div[2]/div[1]/div/div[2]/div[1]/div[1]/span/span[1]/span/ul/li/input");
    private By campoHoraInicio = By.id("horaInicio");
    private By campoHoraFim = By.id("horaFim");
    private By botaoDiaJornadaEspecifico = By.xpath("//*[@id=\"formProfissional\"]/div[2]/div[1]/div/div[2]/div[3]/div[1]/div/div/div/span[1]");
    private By botaoDiaJornadaPadrao = By.xpath("//*[@id=\"formProfissional\"]/div[2]/div[1]/div/div[2]/div[3]/div[1]/div/div/div/span[3]");
    private By botaoJornadaAdicionar = By.xpath("//*[@id=\"formProfissional\"]/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/button");
    private By campoAtendimento = By.xpath("//*[@id=\"comboTipoAtendimentos\"]");
    private By campoTempoAtendimento = By.id("tempo");
    private By campoValorAtendimento = By.xpath("//*[@id=\"valor\"]");
    private By botaoAssociarAtendimento = By.xpath("//*[@id=\"formProfissional\"]/div[2]/div[2]/div/div[2]/div[2]/div[3]/div/button");
    private By campoConvenio = By.id("comboConveniosMedicos");
    private By campoMaximaDia = By.xpath("//*[@id=\"max\"]");
    private By botaoAssociarConvenio = By.xpath("//*[@id=\"formProfissional\"]/div[2]/div[3]/div/div[2]/div[2]/div[2]/div/button");
    private By botaoSalvar = By.xpath("//*[@id=\"formProfissional\"]/button");


    public telaCadastroProfissional (WebDriver driver){this.driver = driver;}

    public void clickBotaoAdicionarProfissional (){driver.findElement(botaoAdicionarProfissional).click();}

    public void digitaCampoNome (String campoNomeDigitado){
        driver.findElement(campoNome).clear();
        driver.findElement(campoNome).sendKeys(campoNomeDigitado);
    }

    public void digitaCampoQuantidadeRetorno (String campoQuantidadeRetornoDigitado){
        driver.findElement(campoQuantidadeRetorno).clear();
        driver.findElement(campoQuantidadeRetorno).sendKeys(campoQuantidadeRetornoDigitado);
    }

    public void associarUsuario (String buscaUsuario) {
        Select dropdown = new Select(driver.findElement(campoAssociarUsuario));
        dropdown.selectByVisibleText(buscaUsuario);
    }

    public void clickUsuarioCompartilhado (){driver.findElement(botaoUsuarioCompartilhado).click();}

    public void clickUsuarioEspecifico (){driver.findElement(botaoUsuarioEspecifico).click();}

    public void digitaDiaSemana (String diaSemana){
        Select dropdown = new Select(driver.findElement(campoDiaSemana));
        dropdown.selectByVisibleText(diaSemana);
    }

    public void digitaHoraInicio (String campoHoraInicioDigitado){
        driver.findElement(campoHoraInicio).clear();
        driver.findElement(campoHoraInicio).sendKeys(campoHoraInicioDigitado);
    }

    public void digitaHoraFim (String campoHoraFimDgitado){
        driver.findElement(campoHoraFim).clear();
        driver.findElement(campoHoraFim).sendKeys(campoHoraFimDgitado);
    }

    public void clickDiaJornadaEspecifico(){driver.findElement(botaoDiaJornadaEspecifico).click();}

    public void clickDiaJornadaPadrao(){driver.findElement(botaoDiaJornadaPadrao).click();}

    public void clickJornadaAdicionar(){driver.findElement(botaoJornadaAdicionar).click();}

    public void digitaCampoAtendimento (String atendimento){
     Select dropdown  = new Select(driver.findElement(campoAtendimento));
     dropdown.selectByVisibleText(atendimento);
    }

    public void digitaTempoAtendimento (String campoTempoAtendimentoDigitado){
        driver.findElement(campoTempoAtendimento).clear();
        driver.findElement(campoTempoAtendimento).sendKeys(campoTempoAtendimentoDigitado);
    }

    public void digitaValorAtendimento (String campoValorAtendimentoDigitado){
        driver.findElement(campoValorAtendimento).clear();
        driver.findElement(campoValorAtendimento).sendKeys(campoValorAtendimentoDigitado);
    }

    public void clickBotaoAssociar (){driver.findElement(botaoAssociarAtendimento).click();}

    public void digitaCampoConvenio (String convenio){
        Select dropdown  = new Select(driver.findElement(campoConvenio));
        dropdown.selectByVisibleText(convenio);
    }//ver com o sullivan

    public void digitaMaximaDia (String campoMaximaDiaDigitado){
        driver.findElement(campoMaximaDia).clear();
        driver.findElement(campoMaximaDia).sendKeys(campoMaximaDiaDigitado);
    }

    public void clickAssociarConvenio (){driver.findElement(botaoAssociarConvenio).click();}

    public void clickSalvarProfissional (){driver.findElement(botaoSalvar).click();}




}
