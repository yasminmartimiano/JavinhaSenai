package Ternaria;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma idade: ");
        int idade = sc.nextInt();
        System.out.println((idade < 18) ? "Menor de idade" : "Maior de idade");
        sc.close();
    }
}
