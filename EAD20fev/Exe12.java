package EAD20fev;

import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] numeros = new int[3][3];
        int soma = 0;
        System.out.println("Insira os valores de uma Matriz 3x3: ");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                numeros[i][j] = sc.nextInt();
                soma += numeros[i][j];
            }
        }
        System.out.println("A soma dos valores inseridos no Array multidimensional é: " + soma);
        sc.close();
    }
}
