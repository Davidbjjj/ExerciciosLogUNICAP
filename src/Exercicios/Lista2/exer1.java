package Exercicios.Lista2;

import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        int nota1,nota2,nota3,ME =0;
        float MA =0;
        String ID;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o número de indentificação");
        ID= sc.next();
        System.out.println("Digite a primeira nota");
        nota1 = sc.nextInt();
        System.out.println("Digite a segunda nota");
        nota2 = sc.nextInt();
        System.out.println("Digite a terceira nota");
        nota3 = sc.nextInt();
        System.out.println("Digite a média dos exercícios");
        ME = sc.nextInt();

        MA=(nota1+nota2*2+nota3*3+ME)/7;
        if (MA>=9 && MA<=10){
            System.out.println("Numero de indentificação: "+ID+" Nota1: "+nota1+", Nota2: "+nota2+", Nota3: "+nota3+", Média nos exercícios:"+ME+", Media de Aproveitamento"+MA+", Conceit: A");
        }

    }
}
