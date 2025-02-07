package Ternaria;

import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o ano: ");
        int ano = sc.nextInt();
        System.out.println((ano % 4 == 0 && ano % 100 != 0) ? "É ano bissexto." : "Não é ano bissexto.");
        sc.close();
    }
}
 // Ainda não terminei.