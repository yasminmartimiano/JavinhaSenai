package Ternaria;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = sc.nextInt();
        System.out.println((num > 100) ? "Alto" : "Baixo");
        sc.close();
    }
}
