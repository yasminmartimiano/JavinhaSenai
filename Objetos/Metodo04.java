package Objetos;
import java.util.Scanner;


public class Metodo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma idade: ");
        int idade = sc.nextInt();
        podeVotar(idade);
        sc.close();
    }
    public static void podeVotar(int idade) {
        if (idade >= 16) {
            System.out.println("Pode votar! ");
        } else {
            System.out.println("Não pode votar!");
        }
    }
}

