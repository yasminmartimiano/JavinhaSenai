package NotaAluno;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student x = new Student();
        System.out.println("Insira o nome do aluno: ");
        x.nome = sc.nextLine();
        System.out.println("Insira o valor das três notas dos trimestres: ");
        x.nota1 = sc.nextDouble();
        x.nota2 = sc.nextDouble();
        x.nota3 = sc.nextDouble();

        String nameX = x.nome;
        double finalGrade = x.notaFinal();
        String situacaoFinal = x.situacao();
        System.out.println("FINAL GRADE = " + finalGrade);
        System.out.println(situacaoFinal);
    }
}
