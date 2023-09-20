package Exercicios.Lista2;

import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Este programa calcula as raízes de uma equação do 2º grau (ax^2 + bx + c = 0).");

        // Solicitar os coeficientes da equação
        System.out.print("Informe o coeficiente 'a': ");
        double a = input.nextDouble();

        System.out.print("Informe o coeficiente 'b': ");
        double b = input.nextDouble();

        System.out.print("Informe o coeficiente 'c': ");
        double c = input.nextDouble();

        // Calcular o discriminante (delta)
        double delta = b * b - 4 * a * c;

        // Verificar se existem raízes reais
        if (delta >= 0) {
            // Calcular as raízes
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("As raízes da equação são:");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        } else {
            System.out.println("A equação não tem solução no conjunto dos números reais.");
        }

        input.close();
    }
}
