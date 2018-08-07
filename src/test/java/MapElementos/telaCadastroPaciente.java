package MapElementos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class telaCadastroPaciente {
    public WebDriver driver;

    private By botaoCadastrarNovo = By.xpath("/html/body/div[2]/div[1]/section[2]/div[1]/div/div[1]/form/div[2]/div/a");
    private By campoNomePaciente = By.name("nome");
    private By campoCodigoAntigoPaciente = By.name("codigoAntigo");
    private By radioTipoPessoaFisica = By.id("tipoPessoa1");
    private By radioTipoPessoaJuridica = By.id("tipoPessoa2");
    private By radioTipoPessoaSemDocumento = By.id("tipoPessoa3");
    private By campoCpfOuCnpj = By.name("CpfOuCnpj");
    private By campoRgOuIe = By.name("rgOuIe");
    private By campoDataNascimento = By.name("dataNascimento");
    private By radioSexoMasculino = By.id("id_MASCULINO");
    private By radioSexoFeminino = By.id("id_FIMININO");
    private By campoCisa = By.name("codigoCisa");
    private By campoCns = By.name("codigoCns");
    private By campoEmail = By.name("email");
    private By campoNomeResponsavel = By.name("nomeResponsavel");
    //ver com o sullivan como fazer no campo telefones
    private By campoTelefoneTipo = By.xpath("");
    private By campoTelefoneNumero = By.xpath("");
    private By botaoAdicionarTelefone = By.xpath("/html/body/div[2]/div[1]/section[2]/form/div[4]/div[1]/div/div[2]/div[2]/span/button");
    private By campoCep = By.name("endereco.cep");
    private By campoEstado = By.name("cidade.estado"); //ver com o sullivan como fazer
    private By campoCidade = By.name("");  //ver com o sullivan como fazer
    private By campoLogradouro = By.name("endereco.logradouro");
    private By campoNumero = By.name("endereco.numero");
    private By campoComplemento = By.name("endereco.complemento");
    private By campoBairro = By.name("endereco.bairro");
    private By botaoSalvar = By.xpath("/html/body/div[2]/div[1]/section[2]/form/button[1]");
    private By botaoSalvaProntuario = By.xpath("/html/body/div[2]/div[1]/section[2]/form/button[2]");


}
