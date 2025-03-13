package GettersEsetters;


public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;
    private double saque;
    public static final double TAXA = 5.00;


    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }


    public String getTitular() {
        return titular;
    }


    public void setTitular(String titular) {
        this.titular = titular;
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void setSaque(double saque) {
        if (this.saldo >= (saque + TAXA)) {
            this.saldo -= saque - 5;
            System.out.println("Transferencia realizada com sucesso! ");
            System.out.println("Taxa de saque: R$5.00");
            System.out.println("Atualização dos Dados da conta: ");
            System.out.println("Número da conta: " + getNumero());
            System.out.println("Nome: " + getTitular());
            System.out.println("Valor atual: R$ " + getSaldo());
        } else {
            System.out.println("Transferencia não realizada por falta de saldo! ");
            System.out.println("Taxa de saque: R$" + TAXA);
            System.out.println("Atualização dos Dados da conta: ");
            System.out.println("Número da conta: " + getNumero());
            System.out.println("Nome: " + getTitular());
            System.out.println("Valor atual: R$ " + getSaldo());
        }
    }


}
