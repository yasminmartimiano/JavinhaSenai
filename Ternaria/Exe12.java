package Ternaria;

import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = sc.nextInt();
        System.out.println((num % 2 == 0 && num > 0) ? "Par positivo." : (num % 2 == 0 && num < 0) ?
                "Par negativo." : (num % 2 != 0 && num > 0) ? "Ímpar positivo." : "Ímpar negativo.");
        sc.close();
    }
}
