package Teste;

import java.util.Scanner;

public class Cotidiano004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a idade do pessoa: ");
        int idade = sc.nextInt();
        System.out.println("Insira o peso da pessoa: ");
        int peso = sc.nextInt();
        if (idade >= 18 && idade <= 65 && peso >= 50){
            System.out.println("A pessoa está apta a doar sangue.");
        } else {
            System.out.println("A pessoa não está apta a doar sangue.");
        }
        sc.close();
    }
}
