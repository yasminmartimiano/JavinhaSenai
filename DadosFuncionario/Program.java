package DadosFuncionario;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculo x = new Calculo();

        System.out.println("Name: ");
        x.name = sc.nextLine();
        System.out.println("Gross Salary: ");
        x.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        x.tax = sc.nextDouble();

        String nameX = x.name;
        double netSalaryX = x.netSalary();
        System.out.println("Employee: " + nameX  + ", $ " + String.format("%.2f", x.netSalary()));

        System.out.println("which percentage to increase salary? ");
        x.percent = sc.nextDouble();

        double increaseSalaryX = x.increaseSalary();

        System.out.println("Updated salary if increase applied: " + x.name + ", $ " + String.format("%.2f", x.increaseSalary()));

        sc.close();
    }
}
