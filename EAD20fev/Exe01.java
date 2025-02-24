package EAD20fev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Digite 5 números: ");
        for (int i = 0; i < 5; i++) {
            numeros[i] = sc.nextInt();
        }
        System.out.println("Números digitados: " + Arrays.toString(numeros));

        sc.close();
    }
}
