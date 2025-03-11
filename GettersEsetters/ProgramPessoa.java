package GettersEsetters;

import java.util.Scanner;

public class ProgramPessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        System.out.println("Insira um nome: ");
        String nome = sc.nextLine();
        pessoa.setNome(nome);
        System.out.println("Insira uma idade: ");
        int idade = sc.nextInt();
        pessoa.setIdade(idade);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
