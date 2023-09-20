package Exercicios.Lista2;

import java.util.Scanner;

public class exer12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero >= 0) {
            long fatorial = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é " + fatorial);
        } else {
            System.out.println("Número inválido. Digite um número inteiro positivo.");
        }

        scanner.close();
    }

    public static long calcularFatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            long resultado = 1;
            for (int i = 1; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
}
