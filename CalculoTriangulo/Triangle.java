package CalculoTriangulo;


public class Triangle {
    public double a;
    public double b;
    public double c;


    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    /*
   A outra opcao era de se inserir o tipo de variavel por exemplo
   double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
   return result;
   Essa maneira tbm funciona mas o melhor 'e o de cima por evita quantidades enormes de codigos.
   */
    public static String maiorArea(double areaX, double areaY){
        if(areaX > areaY){
            System.out.println("Larger area: X");
        }else {
            System.out.println("Larger area: Y");
        }
        return "";
    }
}

