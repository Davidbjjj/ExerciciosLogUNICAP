package Exercicios.Lista2;

import java.util.Scanner;

public class exer3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

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

                String escolha = scanner.next();

                switch (escolha) {
                    case "a":
                        double num1 = lerNumero("Digite o primeiro número: ");
                        double num2 = lerNumero("Digite o segundo número: ");
                        System.out.println("Resultado: " + soma(num1, num2));
                        break;
                    case "b":
                        num1 = lerNumero("Digite o primeiro número: ");
                        num2 = lerNumero("Digite o segundo número: ");
                        System.out.println("Resultado: " + diferenca(num1, num2));
                        break;
                    case "c":
                        num1 = lerNumero("Digite o primeiro número: ");
                        num2 = lerNumero("Digite o segundo número: ");
                        System.out.println("Resultado: " + multiplicacao(num1, num2));
                        break;
                    case "d":
                        num1 = lerNumero("Digite o primeiro número: ");
                        num2 = lerNumero("Digite o segundo número: ");
                        if (num2 != 0) {
                            System.out.println("Resultado: " + divisao(num1, num2));
                        } else {
                            System.out.println("Erro: Divisão por zero!");
                        }
                        break;
                    case "e":
                        num1 = lerNumero("Digite o primeiro número: ");
                        num2 = lerNumero("Digite o segundo número: ");
                        if (num2 != 0) {
                            System.out.println("Resultado: " + restoDivisao(num1, num2));
                        } else {
                            System.out.println("Erro: Divisão por zero!");
                        }
                        break;
                    case "f":
                        num1 = lerNumero("Digite o primeiro número: ");
                        num2 = lerNumero("Digite o segundo número: ");
                        System.out.println("Resultado: " + potenciacao(num1, num2));
                        break;
                    case "g":
                        num2 = lerNumero("Digite o segundo número: ");
                        if (num2 >= 0) {
                            System.out.println("Resultado: " + raizQuadrada(num2));
                        } else {
                            System.out.println("Erro: Não é possível calcular a raiz de um número negativo!");
                        }
                        break;
                    case "q":
                        continuar = false;
                        System.out.println("Encerrando o programa.");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            }

            scanner.close();
        }

        public static double lerNumero(String mensagem) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(mensagem);
            return scanner.nextDouble();
        }

        public static double soma(double a, double b) {
            return a + b;
        }

        public static double diferenca(double a, double b) {
            return a - b;
        }

        public static double multiplicacao(double a, double b) {
            return a * b;
        }

        public static double divisao(double a, double b) {
            return a / b;
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
