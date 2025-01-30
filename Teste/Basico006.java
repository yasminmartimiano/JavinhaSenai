package Teste;

import java.util.Scanner;

public class Basico006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a quantidade de dias no ano: ");
        int quant = sc.nextInt();
        if (quant == 365){
            System.out.println("Esse ano não é bissexto.");
        } else if (quant == 366){
            System.out.println("Esse ano é bissexto.");
        } else {
            System.out.println("Número de dias inseridos inválidos. Tente inserir 365/366.");
        }
        sc.close();
    }
}
