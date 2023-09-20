package Exercicios.Lista2;

import java.util.Scanner;

public class exer8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de estudantes na turma: ");
        int numeroEstudantes = scanner.nextInt();

        double somaNotas = 0.0;
        int contador = 0;

        for (int i = 1; i <= numeroEstudantes; i++) {
            System.out.println("Digite a nota do estudante " + i + ": ");
            double nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                somaNotas += nota;
                contador++;
            } else {
                System.out.println("Nota inválida. Digite uma nota entre 0 e 10.");
                i--; // Reduz o índice para repetir a entrada da nota inválida.
            }
        }

        if (contador > 0) {
            double media = somaNotas / contador;
            System.out.println("A média das notas dos estudantes é: " + media);
        } else {
            System.out.println("Não foram inseridas notas válidas.");
        }

        scanner.close();
    }
}
