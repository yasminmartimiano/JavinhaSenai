package Ternaria;

import java.util.Scanner;

public class Exe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um dia da semana. (Ex.: Dom,Seg,Ter,Qua,Qui,Sex,Sab)");
        String dia = sc.nextLine();
        System.out.println((dia == "Sab" || dia == "Dom") ? "Final de semana." : "Dia útil.");
    }
}
