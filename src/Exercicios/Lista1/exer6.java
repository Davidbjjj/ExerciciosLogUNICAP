package Exercicios.Lista1;

import java.util.Scanner;

public class exer6 {
    public static void main(String[] args) {
        int a, b, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um número");
        a = sc.nextInt();
        System.out.println("digite um número");
        b = sc.nextInt();
        System.out.println("digite um número");
        c = sc.nextInt();

        if (a >= b && b >= c) {
            System.out.println(c + " " + b + " " + a);
        } else if (c >= b && b >= a) {
            System.out.println(a + " " + b + " " + c);
        } else if (b >= a && a >= c) {
            System.out.println(c + " " + a + " " + b);
        } else if (b >= c && c >= a) {
            System.out.println(a + " " + c + " " + b);
        } else if (a>c && c>b) {
            System.out.println(b + " " + c + " " + a);
        }else if(b>a && a>c) {
            System.out.println(b + " " + a + " " + c);
        }

    }
}
