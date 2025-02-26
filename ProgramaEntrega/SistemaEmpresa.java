package ProgramaEntrega;

import java.util.Arrays;
import java.util.Scanner;

public class SistemaEmpresa {
    public static void main(String[] args) {
        Entrega entrega = new Entrega();


        Produto p1 = new Produto("Mouse", "P001");
        Produto p2 = new Produto("Teclado", "P002");
        Produto p3 = new Produto("Fone", "P003");

        Pedido pedido1 = new Pedido("PED123", Arrays.asList(p1, p2), EstadoPedido.ENTREGUE);

        entrega.adicionarPedido(pedido1);

        Scanner sc = new Scanner(System.in);
        System.out.println("----------Sistema de entregas----------");
        System.out.println("Por favor, digite o código do pedido: ");
        String codigoPedido = sc.nextLine();

        Pedido pedidoEncontrado = entrega.buscarPedido(codigoPedido);
        if (pedidoEncontrado != null) {
            System.out.println(pedidoEncontrado);
        } else {
            System.out.println("Pedido não encontrado. Por favor, reinicie o programa e tente novamente.");
        }
        sc.close();
    }
}
