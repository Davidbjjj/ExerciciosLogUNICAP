package main.java;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c,delta,x,x1,x2;

        System.out.println("Diga quem é a,b,c");
        System.out.print("a: ");
        a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("a não pode ser 0");
            return;
        }

        System.out.print("b: ");
        b = scanner.nextDouble();

        System.out.print("c: ");
        c = scanner.nextDouble();

        delta = b * b - 4 * a * c;

        if (delta > 0) {
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes são x1 = " + x1 + " e x2 = " + x2 + ".");
        } else if (delta == 0) {
            x = -b / (2 * a);
            System.out.println("A única raiz é x = " + x + ".");
        } else {
            System.out.println("Não há raízes reais.");
        }

    }
}
