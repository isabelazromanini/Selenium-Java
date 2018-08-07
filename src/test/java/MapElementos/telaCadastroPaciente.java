package MapElementos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class telaCadastroPaciente {
    public WebDriver driver;

    private By botaoCadastrarNovo = By.xpath("/html/body/div[2]/div[1]/section[2]/div[1]/div/div[1]/form/div[2]/div/a");
    private By campoNomePaciente = By.name("nome");
    private By campoCodigoAntigoPaciente = By.name("codigoAntigo");
    private By checkTipoPessoaFisica = By.id("tipoPessoa1");
    private By checkTipoPessoaJuridica = By.id("tipoPessoa2");
    private By checkTipoPessoaSemDocumento = By.id("tipoPessoa3");
    private By campoCpfOuCnpj = By.name("CpfOuCnpj");


}
