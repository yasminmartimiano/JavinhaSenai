package Ternaria;

import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um caractere: ");
        char letra = sc.next().charAt(0);
        System.out.println((letra == 'a' || letra == 'e' ||letra == 'i' ||letra == 'o'|| letra == 'u') ? "Vogal" : "Consoante");
        sc.close();
    }
}
