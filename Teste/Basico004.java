package Teste;

import java.util.Scanner;

public class Basico004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma idade: ");
        int idade = sc.nextInt();

        if (idade >= 16){
            System.out.println("A pessoa pode votar!");
        } else {
            System.out.println("A pessoa não pode votar!");
        }

        sc.close();
    }
}
