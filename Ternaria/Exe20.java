package Ternaria;

import java.util.Scanner;

public class Exe20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a nota do aluno: ");
        double nota = sc.nextDouble();
        System.out.println((nota <= 6.9 && nota >= 5) ? "Recuperação" : (nota >= 7) ? "Aprovado" : "Reprovado");
    }
}
