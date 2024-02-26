/** Estudantes: David Pontes Vieira Da Silva
 Juliana Coroline da Cunha Oliveira*/
package Exercicios.Projeto;

import java.util.Scanner;
public class exer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char continuar = 's';

        while (continuar == 's' || continuar == 'S') {
            System.out.print("Digite um número inteiro positivo: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("Digite um número inteiro positivo.");
                continue;
            }

            long fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial);

            System.out.print("Calcular outro fatorial? (s/n): ");
            continuar = scanner.next().charAt(0);
        }
    }
}
