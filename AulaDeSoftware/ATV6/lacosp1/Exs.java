import java.util.Scanner;

public class Exs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Verificar Nota");
            System.out.println("2. Verificar Usuário e Senha");
            System.out.println("3. Validar Informações Pessoais");
            System.out.println("4. Calcular Crescimento Populacional (País A x País B)");
            System.out.println("5. Calcular Crescimento Populacional (Customizado)");
            System.out.println("6. Imprimir Números de 1 a 20");
            System.out.println("7. Encontrar o Maior Número");
            System.out.println("8. Calcular Soma e Média de Números");
            System.out.println("9. Imprimir Números Ímpares entre 1 e 50");
            System.out.println("10. Gerar Números em um Intervalo");
            System.out.println("11. Gerar Números em um Intervalo e Calcular Soma");
            System.out.println("12. Gerar Tabuada");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    Nota.verificarNota(scanner);
                    break;
                case 2:
                    UsuarioSenha.verificarUsuarioSenha(scanner);
                    break;
                case 3:
                    InformacoesPessoais.validarInformacoes(scanner);
                    break;
                case 4:
                    CrescimentoPopulacionalFixo.calcularCrescimentoPopulacional();
                    break;
                case 5:
                    CrescimentoPopulacionalCustomizado.calcularCrescimentoPopulacionalCustomizado(scanner);
                    break;
                case 6:
                    ImprimirNumeros.imprimirNumeros();
                    break;
                case 7:
                    MaiorNumero.encontrarMaiorNumero(scanner);
                    break;
                case 8:
                    SomaMedia.calcularSomaMedia(scanner);
                    break;
                case 9:
                    NumerosImpares.imprimirNumerosImpares();
                    break;
                case 10:
                    Intervalo.gerarNumerosIntervalo(scanner);
                    break;
                case 11:
                    IntervaloSoma.gerarNumerosIntervaloSomar(scanner);
                    break;
                case 12:
                    Tabuada.gerarTabuada(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (choice != 0);
        
        scanner.close();
    }
}

class Nota {
    public static void verificarNota(Scanner scanner) {
        int nota;
        do {
            System.out.println("Digite uma nota entre zero e dez:");
            nota = scanner.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido!");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida: " + nota);
    }
}

class UsuarioSenha {
    public static void verificarUsuarioSenha(Scanner scanner) {
        String usuario, senha;

        do {
            System.out.println("Digite o nome de usuário:");
            usuario = scanner.next();
            System.out.println("Digite a senha:");
            senha = scanner.next();

            if (senha.equals(usuario)) {
                System.out.println("Senha não pode ser igual ao nome de usuário!");
            }
        } while (senha.equals(usuario));

        System.out.println("Login realizado com sucesso!");
    }
}

class InformacoesPessoais {
    public static void validarInformacoes(Scanner scanner) {
        String nome;
        int idade;
        double salario;
        char sexo, estadoCivil;

        do {
            System.out.println("Digite o nome (maior que 3 caracteres):");
            nome = scanner.next();
        } while (nome.length() <= 3);

        do {
            System.out.println("Digite a idade (entre 0 e 150):");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

        do {
            System.out.println("Digite o salário (maior que zero):");
            salario = scanner.nextDouble();
        } while (salario <= 0);

        do {
            System.out.println("Digite o sexo ('f' ou 'm'):");
            sexo = scanner.next().charAt(0);
        } while (sexo != 'f' && sexo != 'm');

        do {
            System.out.println("Digite o estado civil ('s', 'c', 'v' ou 'd'):");
            estadoCivil = scanner.next().charAt(0);
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

        System.out.println("Informações validadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
    }
}

class CrescimentoPopulacionalFixo {
    public static void calcularCrescimentoPopulacional() {
        int popA = 80000;
        int popB = 200000;
        double taxaCrescimentoA = 0.03;
        double taxaCrescimentoB = 0.015;
        int anos = 0;

        while (popA < popB) {
            popA += popA * taxaCrescimentoA;
            popB += popB * taxaCrescimentoB;
            anos++;
        }

        System.out.println("Número de anos necessários: " + anos);
    }
}

class CrescimentoPopulacionalCustomizado {
    public static void calcularCrescimentoPopulacionalCustomizado(Scanner scanner) {
        int popA, popB;
        double taxaCrescimentoA, taxaCrescimentoB;
        int anos = 0;

        do {
            System.out.println("Informe a população inicial do país A (maior que 0):");
            popA = scanner.nextInt();
        } while (popA <= 0);

        do {
            System.out.println("Informe a taxa de crescimento anual do país A (em decimal):");
            taxaCrescimentoA = scanner.nextDouble();
        } while (taxaCrescimentoA <= 0);

        do {
            System.out.println("Informe a população inicial do país B (maior que 0):");
            popB = scanner.nextInt();
        } while (popB <= 0);

        do {
            System.out.println("Informe a taxa de crescimento anual do país B (em decimal):");
            taxaCrescimentoB = scanner.nextDouble();
        } while (taxaCrescimentoB <= 0);

        while (popA < popB) {
            popA += popA * taxaCrescimentoA;
            popB += popB * taxaCrescimentoB;
            anos++;
        }

        System.out.println("Número de anos necessários: " + anos);
    }
}

class ImprimirNumeros {
    public static void imprimirNumeros() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
    }
}

class MaiorNumero {
    public static void encontrarMaiorNumero(Scanner scanner) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            int num = scanner.nextInt();
            if (num > max) {
                max = num;
            }
        }
        System.out.println("O maior número é: " + max);
    }
}

class SomaMedia {
    public static void calcularSomaMedia(Scanner scanner) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            int num = scanner.nextInt();
            sum += num;
        }
        double media = (double) sum / 5;
        System.out.println("A soma dos números é: " + sum);
        System.out.println("A média dos números é: " + media);
    }
}

class NumerosImpares {
    public static void imprimirNumerosImpares() {
        for (int i = 1; i <= 50; i += 2) {
            System.out.println(i);
        }
    }
}

class Intervalo {
    public static void gerarNumerosIntervalo(Scanner scanner) {
        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }
    }
}

class IntervaloSoma {
    public static void gerarNumerosIntervaloSomar(Scanner scanner) {
        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("A soma dos números é: " + sum);
    }
}

class Tabuada {
    public static void gerarTabuada(Scanner scanner) {
        System.out.println("Digite o número para gerar a tabuada:");
        int num = scanner.nextInt();

        System.out.println("Tabuada de " + num + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}
