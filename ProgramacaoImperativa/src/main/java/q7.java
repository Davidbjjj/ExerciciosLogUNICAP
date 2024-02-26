package main.java;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Diga a altura do triângulo: ");
        int altura = scanner.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = altura - 1; i >= 1; i--) {
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
