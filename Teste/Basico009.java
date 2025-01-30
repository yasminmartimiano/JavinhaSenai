package Teste;

import java.util.Scanner;

public class Basico009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = sc.nextInt();
        if (num >=10 && num <= 50){
            System.out.println("O número " + num + " está no intervalo de 10 à 50.");
        } else {
            System.out.println("O número " + num + " não está no intervalo de 10 à 50.");
        }
        sc.close();
    }
}
