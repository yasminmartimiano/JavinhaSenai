package Ternaria;

import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = sc.nextInt();
        System.out.println((num % 5 == 0) ? "Múltiplo de 5." : "Não é múltiplo de 5.");
        sc.close();
    }
}
