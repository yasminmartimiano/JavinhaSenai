package Ternaria;

import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = sc.nextInt();
        System.out.println((num >= 10 && num <= 50) ? "Dentro do intervalo. " : "Fora do intervalo. ");
        sc.close();
    }
}
