package Teste;

import java.util.Scanner;

public class Media004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a primeira nota: ");
        double not1 = sc.nextDouble();
        System.out.println("Insira a segunda nota: ");
        double not2 = sc.nextDouble();
        double media = (not1 + not2) / 2;
        if (media >= 10){
            System.out.println("O aluno foi aprovado e recebeu nota máxima.");
        } else {
            System.out.println("O aluno foi aprovado.");
        }
        sc.close();
    }
}
