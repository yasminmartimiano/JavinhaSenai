package EAD20fev;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int soma = 0;
        System.out.println("Digite 5 números: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            soma += num[i];
        }
        System.out.println("Soma dos números inseridos: " + soma);
        sc.close();
    }
}
