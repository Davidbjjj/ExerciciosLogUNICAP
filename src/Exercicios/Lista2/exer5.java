package Exercicios.Lista2;

import java.util.Scanner;

public class exer5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("escreva dois números");
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();

        if (n1==n2){
            System.out.println("os números são iguais");
        }else if(n1>n2){
            System.out.println("Primeiro é maior");
        }else if(n2>n1){
            System.out.println("Segundo é maior");
        }
    }
}
