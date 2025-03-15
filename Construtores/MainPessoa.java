package Construtores;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa pessoaConhecida = new Pessoa("Manoel Gomes",55);
        Pessoa pessoaDesconhecida = new Pessoa();

        System.out.println("Pessoa conhecida:" );
        pessoaConhecida.exibirDados();
        System.out.println("Pessoa desconhecida:" );
        pessoaDesconhecida.exibirDados();
    }
}
