package Exercicios.Lista1;

import java.util.Scanner;

public class exer3 {
    public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    int a,b,c=0;
        System.out.println("Digite um número");
        a=sc.nextInt();
        System.out.println("Digite um número");
        b=sc.nextInt();
        if(a==b){
            c=a+b;
            System.out.println(c);
        }
        else {
            c=a*b;
            System.out.println(c);
        }
    }

}
