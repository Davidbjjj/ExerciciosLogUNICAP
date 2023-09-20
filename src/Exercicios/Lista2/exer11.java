package Exercicios.Lista2;

import java.util.Scanner;

public class exer11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 10 para ver a tabuada: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 10) {
            System.out.println("Tabuada do " + numero + ":");

            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        } else {
            System.out.println("Número fora do intervalo permitido.");
        }

        scanner.close();
    }
}
