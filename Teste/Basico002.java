package Teste;

import java.util.Scanner;

public class Basico002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("O número " + num + " é par.");
        }
        else {
            System.out.println("O número " + num + " é ímpar.");
        }
        sc.close();
    }
}
