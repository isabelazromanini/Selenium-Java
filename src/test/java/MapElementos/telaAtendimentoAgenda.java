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
    public By tipoProcedimento = By.xpath("");
    public By tempoAtendimento = By.xpath("");
    public By observacao = By.xpath("");



}
