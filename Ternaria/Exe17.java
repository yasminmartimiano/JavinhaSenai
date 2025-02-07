package Ternaria;

import java.util.Scanner;

public class Exe17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua idade: ");
        int idade = sc.nextInt();
        System.out.println("É estudante? (S/N) ");
        char estudante = sc.next().charAt(0);
        System.out.println((idade >= 60 || estudante == 'S') ? "Tem desconto!" : "Não tem desconto!");
        sc.close();
    }
}
