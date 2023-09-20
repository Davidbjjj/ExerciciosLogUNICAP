package Exercicios.Lista2;

import java.util.Scanner;

public class exer9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeValores = 50;
        int maiorValor = Integer.MIN_VALUE; // Inicializa com o menor valor possível
        int menorValor = Integer.MAX_VALUE; // Inicializa com o maior valor possível

        for (int i = 1; i <= quantidadeValores; i++) {
            System.out.println("Digite o valor " + i + ": ");
            int valor = scanner.nextInt();

            if (valor > maiorValor) {
                maiorValor = valor;
            }

            if (valor < menorValor) {
                menorValor = valor;
            }
        }

        System.out.println("O maior valor lido é: " + maiorValor);
        System.out.println("O menor valor lido é: " + menorValor);

        scanner.close();
    }
}
