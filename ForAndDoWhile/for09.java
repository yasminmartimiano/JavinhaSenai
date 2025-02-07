package ForAndDoWhile;

import java.util.Scanner;

public class for09 {
    public static void main(String[] args) {
        int multiplo = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            multiplo = i * num;
            System.out.println(num + " * " + i + " = " + multiplo);
        }
    }
}
