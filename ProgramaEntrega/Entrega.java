package ProgramaEntrega;

import java.util.ArrayList;
import java.util.List;

public class Entrega {
    private List<Pedido> pedidos;

    public Entrega() {
        pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public Pedido buscarPedido(String codigo) {
        for (Pedido pedido : pedidos) {
            if (pedido.getCodigo().equals(codigo)) {
                return pedido;
            }
        }
        return null;
    }
}
