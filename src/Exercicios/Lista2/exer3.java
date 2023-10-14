package Exercicios.Lista2;

import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("Selecione a operação:");
            System.out.println("a: Soma");
            System.out.println("b: Diferença");
            System.out.println("c: Multiplicação");
            System.out.println("d: Divisão");
            System.out.println("e: Resto da Divisão");
            System.out.println("f: Potenciação");
            System.out.println("g: Raiz Quadrada");
            System.out.println("q: Sair");

            String escolha = sc.next();

            switch (escolha){
                case "a":
                    double num1 = Nume("Digite o primeiro número");
                    double num2 = Nume("Digite o segundo número");
                    System.out.println("Resultado: "+soma(num1,num2));
                    break;

                case "b":
                     num1 = Nume("Digite o primeiro número");
                     num2 = Nume("Digite o segundo número");
                    System.out.println("Resultado: "+sub(num1,num2));
                    break;

                case "c":
                    num1 = Nume("Digite o primeiro número");
                    num2 = Nume("Digite o segundo número");
                    System.out.println("Resultado: "+mult(num1,num2));
                    break;

                case "d":
                    num1 = Nume("Digite o primeiro número: ");
                    num2 = Nume("Digite o segundo número: ");
                    if (num2 != 0) {
                        System.out.println("Resultado: " + divisao(num1, num2));
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                    }
                    break;
                case "e":
                    num1 = Nume("Digite o primeiro número: ");
                    num2 = Nume("Digite o segundo número: ");
                    if (num2 != 0) {
                        System.out.println("Resultado: " + restoDivisao(num1, num2));
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                    }
                    break;
                case "f":
                    num1 = Nume("Digite o primeiro número: ");
                    num2 = Nume("Digite o segundo número: ");
                    System.out.println("Resultado: " + potenciacao(num1, num2));
                    break;
                case "g":
                    num2 = Nume("Digite o segundo número: ");
                    if (num2 >= 0) {
                        System.out.println("Resultado: " + raizQuadrada(num2));
                    } else {
                        System.out.println("Erro: Não é possível calcular a raiz de um número negativo!");
                    }


                case "q":
                    continuar=false;
                    System.out.println("Encerrando o programa.");
                    break;
            }
        }
    }
    public static double Nume(String mensagem){
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensagem);
        return scanner.nextDouble();
    }
    public static double soma(double num1, double num2){
        return num1+num2;
    }
    public static double sub(double num1, double num2) {
        return num1-num2;
    }
    public static double divisao(double num1, double num2){
        return num1/num2;
    }
    public static double mult(double num1, double num2) {
        return num1 * num2;
    }
    public static double restoDivisao(double a, double b) {
        return a % b;
    }

    public static double potenciacao(double a, double b) {
        return Math.pow(a, b);
    }

    public static double raizQuadrada(double b) {
        return Math.sqrt(b);
    }


}
