package Teste;

import java.util.Scanner;

public class Basico010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = sc.nextInt();
        if (num >= 100 && num <= 200){
            System.out.println("O número " + num + " está entre 100 e 200.");
        } else {
            System.out.println("O número " + num + " não está entre 100 e 200.");
        }
        sc.close();
    }
}
