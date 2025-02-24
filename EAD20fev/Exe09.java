package EAD20fev;

import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[7];

        System.out.println("Insira 7 valores: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        
        System.out.println("Valores inseridos na ordem inversa da inserção: ");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
        sc.close();
    }
}
