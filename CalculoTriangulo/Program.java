package CalculoTriangulo;
import CalculoTriangulo.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
       /* Com esta melhoria criamos dentro da classe Triangulo uma funcao que 'e instanciada aqui fazendo com que o codigo
       Fique organizado e que os objetos resposaveis por realizar os calculos estejam nos lugares corretos sendo unica
       mente chamados aqui para que realizaem suas funcoes. */


        Triangle x, y;//Tipo de Objeto criado pexpecificamente para este calculo


        x = new Triangle();//Valores que serao inseridos dentro das variaveis
        y = new Triangle();//Valores que serao inseridos dentro das variaveis


        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();//aqui valores digitados sendo levados para dentro do objeto
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle x: ");
        y.a = sc.nextDouble();//aqui valores digitados sendo levados para dentro do objeto
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areaX = x.area();//a variavel x contem os valores que foram digitados e teram seus valores calculados pe-
        // funcao .area que criamos nao precisando digitar as formulas aqui.
        double areaY = y.area();


        System.out.println("Triangle X area: " + areaX);
        System.out.println("Triangle Y area: " + areaY);
        String maiorArea = Triangle.maiorArea(areaX,areaY);
        System.out.println(maiorArea);
        sc.close();
    }
}
