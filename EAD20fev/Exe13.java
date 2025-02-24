package EAD20fev;

public class Exe13 {
    public static void main(String[] args) {
        int[][] numeros = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int maior = numeros[0][0];
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i][j] > maior) {
                    maior = numeros[i][j];
                }
            }
        }
        System.out.println("Maior valor no array multidimensional: " + maior);
    }
}
