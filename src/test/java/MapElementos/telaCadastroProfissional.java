package MapElementos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class telaCadastroProfissional {

    public WebDriver driver;

    private By botaoAdicionarProfissional = By.xpath("/html/body/div[2]/div[1]/section[1]/div/a/i");
    private By campoNome = By.name("nome");
    private By campoQuantidadeRetorno = By.id("maxRetornoDia");
    private By campoAssociarUsuario = By.xpath("//*[@id=\"usuario\"]");
    private By campoUsuarioCompartilhado = By.xpath("//*[@id=\"formProfissional\"]/div[1]/div[2]/div[4]/div/div/div/span[1]");
    private By BotaoUsuarioEspecifico = By.xpath("//*[@id=\"formProfissional\"]/div[1]/div[2]/div[4]/div/div/div/span[3]");
    private By campoDiasTrabalhados = By.xpath("//*[@id=\"formProfissional\"]/div[2]/div[1]/div/div[2]/div[1]/div[1]/span/span[1]/span/ul/li/input"); //ver com o sullivan como fazer
    private By campoHoraInicio = By.id("horaInicio");
    private By campoHoraFim = By.id("horaFim");
    private By campoDiaJornadaEspecifico = By.xpath("//*[@id=\"formProfissional\"]/div[2]/div[1]/div/div[2]/div[3]/div[1]/div/div/div/span[1]");
    private By campoDiaJornadaPadrao = By.xpath("//*[@id=\"formProfissional\"]/div[2]/div[1]/div/div[2]/div[3]/div[1]/div/div/div/span[3]");
    private By botaoJornadaAdicionar = By.xpath("//*[@id=\"formProfissional\"]/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/button");
    private By campoAtendimento = By.xpath("//*[@id=\"comboTipoAtendimentos\"]");
    private By campoTempoAtendimento = By.id("tempo");
    private By campoValor = By.xpath("//*[@id=\"valor\"]");
    private By botaoAssociarAtendimento = By.xpath("//*[@id=\"formProfissional\"]/div[2]/div[2]/div/div[2]/div[2]/div[3]/div/button");
    private By campoConvenio = By.id("comboConveniosMedicos");
    private By campoMaximaDia = By.xpath("//*[@id=\"max\"]");
    private By botaoAssociarConvenio = By.xpath("//*[@id=\"formProfissional\"]/div[2]/div[3]/div/div[2]/div[2]/div[2]/div/button");
    private By botaoSalvar = By.xpath("//*[@id=\"formProfissional\"]/button");






}
