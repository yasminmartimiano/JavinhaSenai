package Objetos;
import java.util.Scanner;


public class Metodo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira dois números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        comparador(num1,num2);
        sc.close();
    }
    public static void comparador(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " é maior que " + num1);
        } else {
            System.out.println("Números iguais.");
        }
    }
}

