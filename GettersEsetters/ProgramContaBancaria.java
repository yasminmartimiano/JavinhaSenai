package GettersEsetters;
import java.util.Locale;
import java.util.Scanner;

public class ProgramContaBancaria {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContaBancaria contaBancaria = new ContaBancaria();

        System.out.println("Insira o número da conta: ");
        int numero = sc.nextInt();
        contaBancaria.setNumero(numero);

        sc.nextLine(); //consumindo a quebra de linha do nextInt

        System.out.println("Insira o nome do titular: ");
        String titular = sc.nextLine();
        contaBancaria.setTitular(titular);

        System.out.println("Insira o valor inicial do seu saldo: ");
        double saldo = sc.nextDouble();
        contaBancaria.setSaldo(saldo);

        System.out.println("Dados da conta: ");
        System.out.println("Número da conta: " + contaBancaria.getNumero());
        System.out.println("Nome: " + contaBancaria.getTitular());
        System.out.println("Valor atual: " + contaBancaria.getSaldo());

        System.out.println("Insira o valor do saque: ");
        double saque = sc.nextDouble();
        contaBancaria.setSaque(saque);

        sc.close();
    }
}
