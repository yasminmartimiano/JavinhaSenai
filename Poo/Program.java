package Poo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the product data ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        Products product = new Products(name, price, quantity);
        //Product product1 =new Product(name,price, quantity);
        /*invocando outra classe que esta em um pacote diferente, para que o programa atual receba tbm
         * as capacidades do programa invocado de outro pacote.*/
        System.out.println("Product data: " + product); /* Aqui ao inves de colocar pra imprimir todos os objetos estou mandando imprimir
                                        tudo que esta contido dentro da variavel "products, esta impressao esta parame
                                        trizada na classe Products atraves de um toString , o sistema deve atender
                                        ao jeito como eu configurei.
                                      */
        //product.name = ("TV de Plasma");
        System.out.println();//esta aqui para saltar uma linha
        System.out.println("Enter the number os products to be added in stock: ");
        quantity = sc.nextInt();


        System.out.println("Updated data: " + product);

        System.out.println();//esta aqui para saltar uma linha
        System.out.println("Enter the number os products to be remove from stock: ");
        quantity = sc.nextInt();//Aqui nao precisa informar que quantity 'e INT pois o compilador ja entende isso
        product.removeProduct(quantity);

        System.out.println();//esta aqui para saltar uma linha
        System.out.println("Updated number: " + product);
        System.out.println(Products.PI);//uso da classe Statica
        sc.close();
    }

}
