package padroescriacao.factorymethod;

public class ServicoPreparo implements IServico {

    public String cadastrar() {
        return "Lanche pronto!";
    }

    public String excluir() {
        return "Lanche cancelado!";
    }
}
