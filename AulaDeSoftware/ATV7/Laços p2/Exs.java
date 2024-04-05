import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Calcular potência");
            System.out.println("2. Contar números pares e ímpares");
            System.out.println("3. Gerar série de Fibonacci");
            System.out.println("4. Calcular fatorial");
            System.out.println("5. Determinar menor, maior e soma");
            System.out.println("6. Determinar menor, maior e soma (entre 0 e 1000)");
            System.out.println("7. Calcular fatorial (limite de 16)");
            System.out.println("8. Verificar se um número é primo");
            System.out.println("9. Listar primos até N");
            System.out.println("10. Calcular média aritmética de N notas");
            System.out.println("0. Sair");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calcularPotencia(scanner);
                    break;
                case 2:
                    contarParesEImpares(scanner);
                    break;
                case 3:
                    gerarFibonacci(scanner);
                    break;
                case 4:
                    calcularFatorial(scanner);
                    break;
                case 5:
                    determinarMenorMaiorSoma(scanner, false);
                    break;
                case 6:
                    determinarMenorMaiorSoma(scanner, true);
                    break;
                case 7:
                    calcularFatorialComLimite(scanner);
                    break;
                case 8:
                    verificarNumeroPrimo(scanner);
                    break;
                case 9:
                    listarPrimos(scanner);
                    break;
                case 10:
                    calcularMedia(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    public static void calcularPotencia(Scanner scanner) {
        System.out.println("Digite a base:");
        int base = scanner.nextInt();
        System.out.println("Digite o expoente:");
        int expoente = scanner.nextInt();

        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        System.out.println("Resultado: " + resultado);
    }

    public static void contarParesEImpares(Scanner scanner) {
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);
    }

    public static void gerarFibonacci(Scanner scanner) {
        int a = 0, b = 1, c;
        System.out.println("Sequência de Fibonacci:");
        System.out.print(a + ", " + b);

        while ((a + b) <= 500) {
            c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static void calcularFatorial(Scanner scanner) {
        System.out.println("Digite um número para calcular o fatorial:");
        int numero = scanner.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }

    public static void determinarMenorMaiorSoma(Scanner scanner, boolean limite) {
        System.out.println("Quantos números deseja inserir?");
        int quantidade = scanner.nextInt();

        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            int numero = scanner.nextInt();

            if (limite && (numero < 0 || numero > 1000)) {
                System.out.println("Número fora do intervalo! Digite outro número:");
                i--; // decrementa para permitir que o usuário insira outro número
                continue;
            }

            menor = Math.min(menor, numero);
            maior = Math.max(maior, numero);
            soma += numero;
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);
    }

    public static void calcularFatorialComLimite(Scanner scanner) {
        while (true) {
            System.out.println("Digite um número para calcular o fatorial (limite de 16):");
            int numero = scanner.nextInt();

            if (numero >= 0 && numero <= 16) {
                int fatorial = 1;
                for (int i = 1; i <= numero; i++) {
                    fatorial *= i;
                }
                System.out.println("O fatorial de " + numero + " é: " + fatorial);
                break;
            } else {
                System.out.println("Número fora do limite! Digite outro número.");
            }
        }
    }

    public static void verificarNumeroPrimo(Scanner scanner) {
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        boolean primo = true;

        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");

            System.out.print("Divisores de " + numero + ": ");
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }

    public static void listarPrimos(Scanner scanner) {
        System.out.println("Digite um número:");
        int limite = scanner.nextInt();
        int divisoes = 0;

        System.out.println("Números primos até " + limite + ":");

        for (int i = 2; i <= limite; i++) {
            boolean primo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                divisoes++;
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nNúmero total de divisões: " + divisoes);
    }

    public static void calcularMedia(Scanner scanner) {
        System.out.println("Quantas notas deseja inserir?");
        int quantidade = scanner.nextInt();
        double soma = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            double nota = scanner.nextDouble();
            soma += nota;
        }

        double media = soma / quantidade;
        System.out.println("A média das notas é: " + media);
    }
}
