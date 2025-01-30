package Teste;

import java.util.Scanner;

public class Cotidiano003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual temperatura deseja converter? \n(Celcius: 'C'/ fahrenheit: 'F')");
        String tem = sc.nextLine();
        double con;
        System.out.println("Insira a temperatura: ");
        double temperatura = sc.nextDouble();
        if (tem == "C"){
            con = (temperatura * 9/5) + 32;
            System.out.println("Temperatura em Celcius " + temperatura + "°C convertido para fahrenheit:  " + con + "°F." );
        } else if (tem == "F") {
            con = (temperatura - 32) * 5/9;
            System.out.println("Temperatura em fahrenheit " + temperatura + "°F convertido para Celcius :  " + con + "°C." );
        } else {
            System.out.println("Letra inserida incorretamente. Tente usar (C/F).");
        }
        sc.close();
    }
}
