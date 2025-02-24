package EAD20fev;

import java.util.Random;

public class Exe18 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] num = new int[4][4];
        int soma = 0;
        double media = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                num[i][j] = random.nextInt(100);
                soma += num[i][j];
            }
        }
        System.out.println("Soma: " + soma);
        media = soma / (4 * 4);
        System.out.println("A média de todos os elementos de uma matriz 4x4 preenchida aleatoriamente é: " + media);
    }
}
