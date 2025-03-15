package Construtores;

public class Carro {
    private String marca;
    private int ano;

    Carro(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }

    public void mostrarInformacoes() {
        System.out.println("Marca: " + marca + "\nAno: " + ano);
    }
}
