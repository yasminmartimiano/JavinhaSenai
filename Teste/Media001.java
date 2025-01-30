package Teste;

import java.util.Scanner;

public class Media001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a primeira nota: ");
        double not1 = sc.nextDouble();
        System.out.println("Insira a segunda nota: ");
        double not2 = sc.nextDouble();
        double media = (not1 + not2) / 2;
        System.out.println("A média das notas é: " + media + ".");
        sc.close();
    }
}
