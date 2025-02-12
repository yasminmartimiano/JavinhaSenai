package Ternaria;

import java.util.Scanner;

public class Exe22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor do produto: ");
        double valor = sc.nextDouble();
        System.out.println((valor >= 100) ? "Tem frete grátis." : "Não tem frete grátis.");
    }
}
