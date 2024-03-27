package ATV4;

import java.util.Arrays;
import java.util.Scanner;

public class EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Exibir mensagem de boas-vindas");
            System.out.println("2. Verificar paridade de um número");
            System.out.println("3. Calcular média de um conjunto de números");
            System.out.println("4. Converter texto para caixa alta");
            System.out.println("5. Verificar se um número é primo");
            System.out.println("6. Inverter elementos de um array");
            System.out.println("7. Calcular valor com porcentagem");
            System.out.println("8. Verificar se uma palavra é um palíndromo");
            System.out.println("9. Converter número para binário");
            System.out.println("10. Calcular fatorial de um número");
            System.out.println("0. Sair");

            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    exibirMensagemDeBoasVindas();
                    break;
                case 2:
                    System.out.print("Digite um número: ");
                    int numero = scanner.nextInt();
                    System.out.println(numero + " é par? " + verificarParidade(numero));
                    break;
                case 3:
                    System.out.print("Digite os números separados por espaço: ");
                    scanner.nextLine(); // Limpar o buffer do scanner
                    String[] numerosInput = scanner.nextLine().split(" ");
                    double[] numeros = Arrays.stream(numerosInput)
                            .mapToDouble(Double::parseDouble)
                            .toArray();
                    System.out.println("Média dos números: " + calcularMedia(numeros));
                    break;
                case 4:
                    System.out.print("Digite o texto: ");
                    scanner.nextLine(); // Limpar o buffer do scanner
                    String texto = scanner.nextLine();
                    System.out.println("Texto em caixa alta: " + converterParaCaixaAlta(texto));
                    break;
                case 5:
                    System.out.print("Digite um número: ");
                    int num = scanner.nextInt();
                    System.out.println(num + " é primo? " + verificarPrimo(num));
                    break;
                case 6:
                    System.out.print("Digite os elementos do array separados por espaço: ");
                    scanner.nextLine(); // Limpar o buffer do scanner
                    String[] arrayInput = scanner.nextLine().split(" ");
                    int[] array = Arrays.stream(arrayInput)
                            .mapToInt(Integer::parseInt)
                            .toArray();
                    System.out.println("Array original: " + Arrays.toString(array));
                    inverterArray(array);
                    System.out.println("Array invertido: " + Arrays.toString(array));
                    break;
                case 7:
                    System.out.print("Digite o valor: ");
                    double valor = scanner.nextDouble();
                    System.out.print("Digite a porcentagem: ");
                    double porcentagem = scanner.nextDouble();
                    System.out.println("Valor acrescido da porcentagem: " + calcularPorcentagem(valor, porcentagem));
                    break;
                case 8:
                    System.out.print("Digite a palavra: ");
                    scanner.nextLine(); // Limpar o buffer do scanner
                    String palavra = scanner.nextLine();
                    System.out.println(palavra + " é palíndromo? " + verificarPalindromo(palavra));
                    break;
                case 9:
                    System.out.print("Digite o número decimal: ");
                    int numeroDecimal = scanner.nextInt();
                    System.out.println("Representação binária de " + numeroDecimal + ": " + converterParaBinario(numeroDecimal));
                    break;
                case 10:
                    System.out.print("Digite o número: ");
                    int numeroFatorial = scanner.nextInt();
                    System.out.println("Fatorial de " + numeroFatorial + ": " + calcularFatorial(numeroFatorial));
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
        
        scanner.close();
    }

    public static void exibirMensagemDeBoasVindas() {
        System.out.println("Bem-vindo!");
    }

    public static boolean verificarParidade(int numero) {
        return numero % 2 == 0;
    }

    public static double calcularMedia(double[] numeros) {
        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }
        return soma / numeros.length;
    }

    public static String converterParaCaixaAlta(String texto) {
        return texto.toUpperCase();
    }

    public static boolean verificarPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void inverterArray(int[] array) {
        int inicio = 0;
        int fim = array.length - 1;
        while (inicio < fim) {
            int temp = array[inicio];
            array[inicio] = array[fim];
            array[fim] = temp;
            inicio++;
            fim--;
        }
    }

    public static double calcularPorcentagem(double valor, double porcentagem) {
        return valor * (1 + porcentagem / 100);
    }

    public static boolean verificarPalindromo(String palavra) {
        String reverso = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            reverso += palavra.charAt(i);
        }
        return palavra.equalsIgnoreCase(reverso);
    }

    public static String converterParaBinario(int numero) {
        return Integer.toBinaryString(numero);
    }

    public static int calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        }
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
