package NotaAluno;


public class Student {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal() {
        double finalGrade = nota1 + nota2 + nota3;
        return finalGrade;
    }

    public String situacao() {
        if (notaFinal() >= 60){
            return "PASS";
        } else {
            return "FAILED\nMISSING " + (60 - notaFinal()) + " POINTS";
        }
    }

}
