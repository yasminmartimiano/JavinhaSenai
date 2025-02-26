package ProgramaEntrega;

public enum EstadoPedido {
    PENDENTE("Pendente"),
    A_CAMINHO("A caminho"),
    ENTREGUE("Entregue"),
    CANCELADO("Cancelado");

    private final String descricao;

    EstadoPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
