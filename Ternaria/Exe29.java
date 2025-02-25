package Ternaria;

import java.util.Scanner;

public class Exe29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma idade: ");
        int idade = sc.nextInt();
        System.out.println((idade >= 18 && idade <= 60) ? "Adulto" : (idade > 60) ? "Idoso" : "Jovem");
    }
}
