package EAD20fev;

import java.util.Arrays;
import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[8];
        System.out.println("Insira oito valores: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        System.out.println("Números em ordem crescente: ");
        for(int numero : num) {
            System.out.println(numero);
            System.out.println();
        }
        sc.close();
    }
}
