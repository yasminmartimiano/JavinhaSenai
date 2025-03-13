package GettersEsetters;

import java.util.Locale;
import java.util.Scanner;

public class ProgramProduto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Insira o nome do produto: ");
        String nome = sc.nextLine();
        produto.setNome(nome);

        System.out.println("Insira o preço do produto: ");
        double preco = sc.nextDouble();
        produto.setPreco(preco);

        System.out.println("Insira a quantidade no estoque: ");
        int estoque = sc.nextInt();
        produto.setEstoque(estoque);

        sc.nextLine();

        System.out.println("-------------------------------");
        System.out.println("Adicionar quantidade no estoque: ");
        int adicionar = sc.nextInt();
        produto.adicionarEstoque(adicionar);
        System.out.println("Remover quantidade no estoque: ");
        int remover = sc.nextInt();
        produto.removerEstoque(remover);

        System.out.println("Atualização de dados: ");
        System.out.println(produto);
        sc.close();
    }
}