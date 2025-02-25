package Ternaria;

import java.util.Scanner;

public class Exe30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira duas notas: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double media;
        media = (nota1 + nota2) / 2;
        System.out.println((media >= 6) ? "Aprovado" : "Reprovado");
    }
}
