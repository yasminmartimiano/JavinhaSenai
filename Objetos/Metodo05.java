package Objetos;
import java.util.Scanner;


public class Metodo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = sc.nextInt();
        multiplo5(num);
        sc.close();
    }
    public static void multiplo5 (int num) {
        if (num % 5 == 0) {
            System.out.println(num + " é múltiplo de 5.");
        } else {
            System.out.println(num + " não é múltiplo de 5.");
        }
    }
}

