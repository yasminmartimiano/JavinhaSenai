package Ternaria;

import java.util.Scanner;

public class Exe21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = sc.nextInt();
        System.out.println((num > 0 && num % 2 == 0) ? "Positivo e par." : (num > 0 && num % 2 != 0) ?
                "Positivo e Ímpar." : (num < 0 && num % 2 == 0) ? "Negativo e Par." : "Negativo e Ímpar.") ;
    }
}
