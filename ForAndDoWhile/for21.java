package ForAndDoWhile;

import java.util.Scanner;

public class for21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        int soma = somaDosDigitos(Math.abs(num)); // Calcula a soma dos dígitos
        System.out.println("A soma dos dígitos de " + num + " é: " + soma); // Exibe o resultado
        sc.close();
    }
    public static int somaDosDigitos(int numero) {
        int soma = 0;
        while (numero > 0) {
            soma += numero % 10; // Pega o último dígito e soma
            numero /= 10; // Remove o último dígito
        }
        return soma;
    }
};
