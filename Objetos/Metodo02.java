package Objetos;
import java.util.Scanner;


public class Metodo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = sc.nextInt();
        parImpar(num);
        sc.close();
    }
    public static void parImpar(int num) {
        if (num % 2 == 0) {
            System.out.println("Número par.");
        } else {
            System.out.println("Número ímpar.");
        }
    }
}

