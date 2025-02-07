package Ternaria;

import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = sc.nextInt();
        System.out.println((num % 3 == 0 && num % 5 == 0) ? "FizzBuzz" : num);
        sc.close();
    }
}
