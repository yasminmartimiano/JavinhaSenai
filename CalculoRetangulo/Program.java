package CalculoRetangulo;

import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Rectangle x;
        x = new Rectangle();

        System.out.println("Enter rectangle width and height");
        x.base = sc.nextDouble();
        x.altura = sc.nextDouble();

        double areaX = x.area();
        double perimeterX = x.perimeter();
        double diagonalX = x.diagonal();

        System.out.println("AREA = " + areaX);
        System.out.println("PERIMETER = " + perimeterX);
        System.out.println("DIAGONAL = " + diagonalX);
    }
}
