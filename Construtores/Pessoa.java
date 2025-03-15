package Construtores;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public Pessoa(){
        this.nome = "Desconhecido";
        this.idade = 0;
    }
}
