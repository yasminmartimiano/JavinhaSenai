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
        menor = Math.min(not1, Math.min(not2,not3));
        maior = Math.max(not1, Math.max(not2,not3));
        System.out.println("Maior nota: " + maior + ".");
        System.out.println("Menor nota: " + menor + ".");
        sc.close();
    }
}
