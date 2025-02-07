package Ternaria;

import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma nota: ");
        int num = sc.nextInt();
        System.out.println((num >=7) ? "Aprovado" : "Reprovado");
        sc.close();
    }
}