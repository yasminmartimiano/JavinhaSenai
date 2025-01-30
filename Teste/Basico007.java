package Teste;

import java.util.Scanner;

public class Basico007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = sc.nextInt();

        if (num % 5 == 0){
            System.out.println("O número " + num + " é múltiplo de 5.");
        } else {
            System.out.println("O númuro " + num + " não é múltiplo de 5.");
        }
        sc.close();
    }
}
