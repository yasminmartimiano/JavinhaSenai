package Construtores;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private String tipoConta;

    public ContaBancaria(String titular, double saldo, String tipoConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public ContaBancaria(String tipoConta) {
        this.tipoConta = tipoConta;
    }
}
