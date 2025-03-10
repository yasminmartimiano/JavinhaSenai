package CalculoRetangulo;


public class Rectangle {
    //area = base * altura
    //perimetro = 2 * (base + altura)
    //diagonal = Math.sqrt(base^2 + altura^2)
    public double base;
    public double altura;


    public double area() {
        double resultArea = base * altura;
        return resultArea;
    }


    public double perimeter() {
        double resultPerimeter = 2 * (base + altura);
        return resultPerimeter;
    }


    public double diagonal(){
        double resultDiagonal = Math.sqrt((Math.pow(base, 2) + (Math.pow(altura,2))));
        return resultDiagonal;
    }
}