package padroescriacao.factorymethod;

public class ServicoCadastro implements IServico {

    public String cadastrar() {
        return "Cadastro efetuado com sucesso!";
    }

    public String excluir() {
        return "Cadastro cancelado!";
    }
}
