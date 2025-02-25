package Teste;

import java.util.Scanner;

public class Media002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a primeira nota: ");
        double not1 = sc.nextDouble();
        System.out.println("Insira a segunda nota: ");
        double not2 = sc.nextDouble();
        double media = (not1 + not2) / 2;
        if (media >= 8) {
            System.out.println("O aluno foi aprovado!");
        } else if (media >=5 && media <7) {
            System.out.println("O aluno está em recuperação!");
        } else {
            System.out.println("O aluno foi reprovado!");
        }
        System.out.println("Média das notas: " + media + ".");
        sc.close();
    }
}
