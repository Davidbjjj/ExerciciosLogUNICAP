/** Estudantes: David Pontes Vieira Da Silva
                Juliana Coroline da Cunha Oliveira*/
package Exercicios.Projeto;

import java.util.Scanner;
public class exer1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            System.out.print("Escolha a operação (a até g):\n" +
                    "a: Soma\n" +
                    "b: Subtração\n" +
                    "c: Multiplicação\n" +
                    "d: Divisão\n" +
                    "e: Resto da divisão\n" +
                    "f: Potenciação\n" +
                    "g: Raiz Quadrada\n");
            char escolha = scanner.next().charAt(0);

            double resultado = 0.0;

            switch (escolha) {
                case 'a':
                    resultado = numero1 + numero2;
                    break;

                case 'b':
                    resultado = numero1 - numero2;
                    break;

                case 'c':
                    resultado = numero1 * numero2;
                    break;

                case 'd':
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        System.out.println("Erro: Não se pode dividir um número por zero.");
                        return;
                    }
                    break;

                case 'e':
                    if (numero2 != 0) {
                        resultado = numero1 % numero2;
                    } else {
                        System.out.println("Erro: Não se pode dividir um número por zero.");
                        return;
                    }
                    break;

                case 'f':
                    resultado = Math.pow(numero1, numero2);
                    break;
                case 'g':
                    if (numero2 >= 0) {
                        resultado = Math.sqrt(numero2);
                    } else {
                        System.out.println("Erro: Não é possível calcular a raiz quadrada de um número negativo.");
                        return;
                    }
                    break;

                default:
                    System.out.println("Opção inválida, não está de acordo com as letras mostradas.");
                    return;
            }

            System.out.println("Resultado: " + resultado);
        }
    }

