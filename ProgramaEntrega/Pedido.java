package ProgramaEntrega;

import java.util.List;

public class Pedido {
    private String codigo;
    private List<Produto> produtos;
    private EstadoPedido estadoPedido;

    public Pedido(String codigo, List<Produto> produtos, EstadoPedido estadoPedido) {
        this.codigo = codigo;
        this.produtos = produtos;
        this.estadoPedido = estadoPedido;
    }

    public String getCodigo() {
        return codigo;
    }

    public EstadoPedido getEstadoPedido() {
        return estadoPedido;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "codigo='" + codigo + '\'' +
                ", produtos=" + produtos +
                ", estadoPedido=" + estadoPedido +
                '}';
    }
}
