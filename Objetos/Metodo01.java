package Objetos;
import java.util.Scanner;


public class Metodo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número:");
        int num = sc.nextInt();
        positivoNegativo(num);
        sc.close();
    }
    public static void positivoNegativo(int num) {
        if (num > 0) {
            System.out.println("Positivo.");
        } else if (num < 0) {
            System.out.println("Negativo.");
        } else {
            System.out.println("Zero.");
        }
    }
}

