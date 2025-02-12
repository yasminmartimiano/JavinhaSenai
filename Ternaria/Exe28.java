package Ternaria;

import java.util.Scanner;

public class Exe28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = sc.nextInt();
        System.out.println((num >= 20 && num <= 30) ? "Está dentro do intervalo." : "Está fora do intervalo.");
    }
}
