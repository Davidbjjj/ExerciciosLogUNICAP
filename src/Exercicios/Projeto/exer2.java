/** Estudantes: David Pontes Vieira Da Silva
 Juliana Coroline da Cunha Oliveira*/
package Exercicios.Projeto;

import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int QntNumeros = 50;
        double soma = 0;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        for (int i = 1; i <= QntNumeros; i++) {
            System.out.print("Digite o número " + i + ": ");
            double numero = scanner.nextDouble();

            soma += numero;

            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        double media = soma / QntNumeros;

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Média dos valores: " + media);
    }
}
