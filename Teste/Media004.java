package Teste;

import java.util.Scanner;

public class Media004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a nota do aluno: ");
        double nota = sc.nextDouble();
        if (nota >= 10){
            System.out.println("O aluno foi aprovado e recebeu nota máxima.");
        } else {
            System.out.println("O aluno foi aprovado.");
        }
        sc.close();
    }
}
