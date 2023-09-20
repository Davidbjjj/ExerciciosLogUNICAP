package Exercicios.Lista1;

import java.util.Scanner;

public class exer5 {
    public static void main(String[]args){
        int a=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um número");
        a=sc.nextInt();
        if(a%2==0){
            a=a+5;
            System.out.println(a);
        }
        else{
            a=a+8;
            System.out.println(a);
        }
    }
}
