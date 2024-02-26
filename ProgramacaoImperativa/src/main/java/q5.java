package main.java;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int dose,ano,anop;
        System.out.println("Qual o ano que a criança tomou a vacina");
        ano=sc.nextInt();
        System.out.println("Qual o periodo da dose");
        dose=sc.nextInt();
        if (dose<=0){
            System.out.println("Digite um periodo maior que zero!");
        }else {
            for (int periodo = 0; periodo <= 2; periodo++) {
                System.out.println((ano+dose)+(dose * periodo));
            }
        }
    }
}
