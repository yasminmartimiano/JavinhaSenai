package Teste;

import java.util.Scanner;

public class Basico003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num1 = sc.nextInt();
        System.out.println("Insira outro número: ");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println(num1 + " é maior que " + num2 + ".");
        }
        else {
            System.out.println(num2 + " é maior que " + num1 + ".");
        }
        sc.close();
    }
}
