package Exercicios;

import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=0;
        System.out.println("Digite um número");
        a=sc.nextInt();
        if (a%2==0){
            System.out.println("O número é par");
        }
        else {
            System.out.println("O número é ímpar");
        }


    }
}
