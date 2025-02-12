package Ternaria;

import java.util.Scanner;

public class Exe26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua idade: ");
        int idade = sc.nextInt();
        System.out.println((idade >= 16) ? "Pode votar!" : "Não pode votar!");
    }
}
