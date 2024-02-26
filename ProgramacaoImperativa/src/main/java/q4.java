package main.java;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        int dia,mes, ano;
        boolean bissexto;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diga o dia, mes e ano de nascenca");
        dia = scanner.nextInt();
        mes = scanner.nextInt();
        ano = scanner.nextInt();

        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                bissexto = true;
                if (ano % 400 == 0) {
                    bissexto = true;
                }
            } else {
                bissexto = false;
            }
        } else {
            bissexto = false;
        }

        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            System.out.println("Aquario");
        } else if ((mes == 2 && dia >= 19 && dia <= (bissexto ? 29 : 28)) || (mes == 3 && dia <= 20)) {
            System.out.println("Peixes");
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            System.out.println("Aries");
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            System.out.println("Touro");
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            System.out.println("Gemeos");
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            System.out.println("Cancer");
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            System.out.println("Leao");
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            System.out.println("Virgem");
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            System.out.println("Libra");
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            System.out.println("Escorpiao");
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            System.out.println("Sagitario");
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            System.out.println("Capricornio");
        } else {
            System.out.println("Data invalida");
        }
    }
}
