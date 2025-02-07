package Ternaria;

import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira dois números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println((num1 > num2) ? "Maior: " + num1 : "Maior: " + num2);
        sc.close();
    }
}
