package Exercicios;

import java.util.Scanner;

public class exer4 {
    public static void main(String[]args){
        int a=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("digite um numero");
        a=sc.nextInt();
        if (a>0){
            a=a*2;
            System.out.println(a);
        }
        else {
            a=a*3;
            System.out.println(a);

        }
    }
}
