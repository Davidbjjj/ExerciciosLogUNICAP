package Exercicios.Lista2;

import java.util.Scanner;

public class exer4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o valor do lado A do triângulo: ");
            double a = scanner.nextDouble();

            System.out.println("Digite o valor do lado B do triângulo: ");
            double b = scanner.nextDouble();

            System.out.println("Digite o valor do lado C do triângulo: ");
            double c = scanner.nextDouble();

            if (eTriangulo(a, b, c)) {
                System.out.println("Os valores formam um triângulo.");
            } else {
                System.out.println("Os valores não formam um triângulo.");
            }

            scanner.close();
        }

        public static boolean eTriangulo(double a, double b, double c) {
            // Para formar um triângulo, cada lado deve ser menor que a soma dos outros 2 lados.
            return (a < b + c) && (b < a + c) && (c < a + b);
        }
}
