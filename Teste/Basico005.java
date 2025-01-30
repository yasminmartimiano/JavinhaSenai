package Teste;

import java.util.Scanner;

public class Basico005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Insira o segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Insira o terceiro número: ");
        int num3 = sc.nextInt();
        int maior;
        if (num1 > num2){
            if (num1 > num3){
                maior = num1;
            }
            else {
                maior = num3;
            }
        } else {
            if (num2 > num3) {
                maior = num2;
            } else {
                    maior = num3;
                }
            }
        System.out.println("O maior número é: " + maior + ".");
        sc.close();
    }
}
