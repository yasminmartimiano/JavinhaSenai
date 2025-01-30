package Teste;

import java.util.Scanner;

public class Cotidiano002 {
    public static void main(String[] args) {
        int cod = 1513;
        Scanner sc = new Scanner(System.in);
        System.out.println("Código de acesso: " + cod + ".");
        System.out.println("Por favor, insira o código de acesso: ");
        int tentativa = sc.nextInt();
        if (tentativa == cod){
            System.out.println("Código de acesso certo.");
        } else {
            System.out.println("Código de acesso errado.");
        }
        sc.close();
    }
}
