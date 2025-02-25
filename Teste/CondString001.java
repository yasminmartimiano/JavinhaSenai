package Teste;

import java.util.Scanner;

public class CondString001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira 'Sim' ou 'Não': ");
        String palavra = sc.nextLine();
        if (palavra.equals("Sim")) {
            System.out.println("A palavra digitada foi 'Sim'.");
        } else if (palavra.equals("Não")) {
            System.out.println("A palavra digitada foi 'Não'.");
        }
    }
}
