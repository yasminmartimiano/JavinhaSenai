package EAD20fev;

import java.util.Random;
import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(100);
        }
        int maior = num[0];
        int menor = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] > maior) {
                maior = num[i];
            } if (num[i] < menor) {
                menor = num[i];
            }
        }
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
