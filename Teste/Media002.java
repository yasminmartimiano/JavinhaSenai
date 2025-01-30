package Teste;

import java.util.Scanner;

public class Media002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a nota do aluno: ");
        double nota = sc.nextDouble();
        if (nota >= 8) {
            System.out.println("O aluno foi aprovado!");
        } else if (nota >=5 && nota <7) {
            System.out.println("O aluno está em recuperação!");
        } else {
            System.out.println("O aluno foi reprovado!");
        }
        sc.close();
    }
}
