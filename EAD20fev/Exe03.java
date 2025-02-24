package EAD20fev;

import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[6];
        int soma = 0;
        int media = 0;
        System.out.println("Digite 6 números: ");
        for (int i = 0; i < 6; i++) {
            num[i] = sc.nextInt();
            soma += num[i];
            media = soma / 6;
        }
        System.out.println("Média dos números inseridos: " + media);
    }
}
