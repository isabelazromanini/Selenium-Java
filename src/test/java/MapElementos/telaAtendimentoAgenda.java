package MapElementos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class telaAtendimentoAgenda {

    public WebDriver driver;

    public By selecionarProfissional = By.name("codigo");
    public By selecionarTipoAtendimento = By.xpath("//*[@id=\"external-events\"]/div[1]");
    public By pesquisarPaciente = By.id("pessoa-nome");
    public By telefonePaciente = By.xpath("//*[@id=\"novoEventoProfissionalModal\"]/div/div/div[2]/form/div/div[2]/div[5]/ul/li/span");
    public By convenioPaciente = By.xpath("//*[@id=\"convenioMedico\"]");
    public By valor = By.xpath("//*[@id=\"valorAtendimento\"]");
    public By tipoProcedimento = By.xpath("//*[@id=\"tipoProcedimento\"]");
    public By tempoAtendimento = By.xpath("//*[@id=\"tempoCustom\"]");
    public By observacao = By.xpath("//*[@id=\"agenda-observacao\"]");
    public By calendario = By.xpath(""); //ver com o sulli como fazer
    public By horarioManual = By.id("horarioCustom");
    public By botaoNormal = By.xpath("//*[@id=\"novoEventoProfissionalModal\"]/div/div/div[2]/form/div/div[3]/div/div[2]/div[3]/div/div[2]/div[2]/div[2]/div[2]/div/div/span[3]");
    public By botaoExcecao = By.xpath("//*[@id=\"novoEventoProfissionalModal\"]/div/div/div[2]/form/div/div[3]/div/div[2]/div[3]/div/div[2]/div[2]/div[2]/div[2]/div/div/span[1]");




}
