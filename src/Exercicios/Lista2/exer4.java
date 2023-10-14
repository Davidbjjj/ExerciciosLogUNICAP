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

            if (triandulo(a,b,c)){
                System.out.println("é um triangulo possível");
            }else {
                System.out.println("não pode ser um triangulo");
            }

        }
        public static boolean triandulo(double a, double b, double c) {
             return ((a < b + c) && (b < a + c) && (c < a + b));

        }
}
