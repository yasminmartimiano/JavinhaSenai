package DadosFuncionario;

public class Calculo {
    public String name;
    public double grossSalary;
    public double tax;
    public double percent;

    public double netSalary() {
        double netSalaryX = grossSalary - tax;
        return netSalaryX;
    }

    public double increaseSalary() {
        return netSalary() + (percent / 100) * grossSalary;
    }
}

