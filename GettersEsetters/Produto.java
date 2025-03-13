package GettersEsetters;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido! Por favor, tente um valor positivo.");
        }
    }

    public void setEstoque(int estoque) {
        if (estoque >= 0) {
            this.estoque = estoque;
        } else {
            System.out.println("Estoque inválido! Por favor, tente uma quantidade positiva.");
        }
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.estoque += quantidade;
        } else {
            System.out.println("A quantidade a ser adicionada deve ser positiva.");
        }
    }

    public void removerEstoque(int quantidade) {
        if (quantidade > 0 && this.estoque >= quantidade) {
            this.estoque -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente para remover do estoque ou valor inválido!");
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome ='" + nome + '\'' +
                ", preco =" + preco +
                ", estoque =" + estoque +
                '}';
    }
}