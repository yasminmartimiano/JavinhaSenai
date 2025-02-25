package Poo;

public class Products {

    public String name;
    public double price;
    public  int quantity;


    public Products(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static final double PI= 3.1400;
    /*
    Tipo Final não aceita alteração de valor atraves do sistema
    Static é um tipo de classe que se utiliza de capacidades que
    as tornam independentes por não precisão de
    mais nada para que elas funcionem ou sejam invocadas
    */

    public double totalValueInStock(){

        return price * quantity;
    }
    public void addProduct(int quantity){

        this.quantity += quantity;
    }
    public void removeProduct(int quantity){

        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
