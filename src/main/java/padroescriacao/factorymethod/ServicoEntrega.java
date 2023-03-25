package padroescriacao.factorymethod;

public class ServicoEntrega implements IServico {

    public String cadastrar() {
        return "Entrega efetuada com sucesso!";
    }

    public String excluir() {
        return "Entrega cancelado!";
    }
}
