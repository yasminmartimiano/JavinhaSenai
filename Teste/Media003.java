package Teste;

import java.util.Scanner;

public class Media003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a primeira nota: ");
        double not1 = sc.nextDouble();
        System.out.println("Insira a segunda nota: ");
        double not2 = sc.nextDouble();
        System.out.println("Insira a terceira nota: ");
        double not3 = sc.nextDouble();
        double maior, menor;
        if (not1 > not2 && not1 > not3) {
            maior = not1;
        } else if (not2 > not1 && not2 > not3) {
            maior = not2;
        } else {
            maior = not3;
        }

        if (not1 < not2 && not1 < not3) {
            menor = not1;
        } else if (not2 < not1 && not2 < not3) {
            menor = not2;
        } else {
            menor = not3;
        }
        System.out.println("Maior nota: " + maior + ".");
        System.out.println("Menor nota: " + menor + ".");
        sc.close();
    }
}
