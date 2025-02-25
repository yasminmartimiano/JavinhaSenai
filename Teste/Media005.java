package Teste;

import java.util.Scanner;

public class Media005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira duas notas da primeira disciplina: ");
        double not1 = sc.nextDouble();
        double not2 = sc.nextDouble();
        double media1 = (not1 + not2) / 2;
        if (media1 >=7 ) {
            System.out.println("O aluno foi aprovado na primeira disciplina. Média: " + media1);
        } else {
            System.out.println("O aluno não foi aprovado na primeira disciplina. Média: " + media1);
        }

        System.out.println("Insira duas notas da segunda disciplina: ");
        double not3 = sc.nextDouble();
        double not4 = sc.nextDouble();
        double media2 = (not1 + not2) / 2;
        if (media2 >=7 ) {
            System.out.println("O aluno foi aprovado na segunda disciplina. Média: " + media2);
        } else {
            System.out.println("O aluno não foi aprovado na segunda disciplina. Média: " + media2);
        }
    }
}
