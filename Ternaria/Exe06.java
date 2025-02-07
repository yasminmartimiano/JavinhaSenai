package Ternaria;

import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a idade: ");
        int idade = sc.nextInt();
        System.out.println("Possui carteira? (Sim: 1 | Não: 0)");
        int carteira = sc.nextInt();
        System.out.println((idade > 18 && carteira == 1) ? "Pode dirigir." : "Não pode");
        sc.close();
    }
}
