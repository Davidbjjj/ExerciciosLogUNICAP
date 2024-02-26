package main.java;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quadrado = 0;
        int lados = 0;
        int loop = 0;
        System.out.println("Diga o tamanho do lado do quadrado:");
        lados = sc.nextInt();

        while (lados>loop) {

            while (quadrado < lados) {
                System.out.print("*");
                quadrado++;
            }
            loop++;
            quadrado=0;
            System.out.println(" ");
        }

    }
}

