package Dicionario;

import java.util.HashMap;
import java.util.Scanner;

// Classe para representar um aluno
class Aluno {
    String nome;
    double nota;

    // Construtor para inicializar o nome e a nota do aluno
    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }
}

// Classe que contém um dicionário de alunos e métodos para manipulá-lo
class DicionarioDeAlunos {
    HashMap<Integer, Aluno> alunos; // Dicionário onde a chave é o ID do aluno e o valor é o objeto Aluno

    // Construtor para inicializar o dicionário de alunos
    public DicionarioDeAlunos() {
        this.alunos = new HashMap<>();
    }

    // Método para adicionar um novo aluno ao dicionário
    public void adicionarAluno() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ID do aluno:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();
        System.out.println("Digite a nota do aluno:");
        double nota = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, nota);
        alunos.put(id, aluno); // Adiciona o aluno ao dicionário com o ID fornecido
    }

    // Método para buscar um aluno por ID no dicionário
    public Aluno buscarAlunoPorId(int id) {
        return alunos.get(id); // Retorna o aluno associado ao ID fornecido, ou null se não encontrado
    }

    // Método para calcular a média das notas de todos os alunos no dicionário
    public double calcularMediaDasNotas() {
        double soma = 0;
        for (Aluno aluno : alunos.values()) {
            soma += aluno.nota;
        }
        return soma / alunos.size(); // Retorna a média das notas dos alunos no dicionário
    }

    // Classe interna que contém o método main para execução do programa
    public static class Main {
        public static void main(String[] args) {
            DicionarioDeAlunos dicionario = new DicionarioDeAlunos(); // Instância da classe DicionarioDeAlunos
            Scanner scanner = new Scanner(System.in); // Instância de Scanner para entrada do usuário
            int opcao = 0; // Variável para armazenar a opção do usuário

            // Loop para exibir o menu e processar as opções do usuário
            while (opcao != 4) {
                System.out.println("\nMenu:");
                System.out.println("1. Adicionar aluno");
                System.out.println("2. Buscar aluno por ID");
                System.out.println("3. Calcular média das notas");
                System.out.println("4. Sair");
                System.out.println("Escolha uma opção:");

                opcao = scanner.nextInt(); // Lê a opção do usuário

                // Switch para determinar a ação com base na opção escolhida pelo usuário
                switch (opcao) {
                    case 1:
                        dicionario.adicionarAluno(); // Chama o método para adicionar um novo aluno
                        break;
                    case 2:
                        System.out.println("Digite o ID do aluno:");
                        int id = scanner.nextInt();
                        Aluno aluno = dicionario.buscarAlunoPorId(id); // Busca o aluno pelo ID fornecido
                        if (aluno != null) { // Se o aluno for encontrado
                            System.out.println("Aluno encontrado:");
                            System.out.println("Nome: " + aluno.nome);
                            System.out.println("Nota: " + aluno.nota);
                        } else { // Se o aluno não for encontrado
                            System.out.println("Aluno não encontrado.");
                        }
                        break;
                    case 3:
                        System.out.println("Média das notas: " + dicionario.calcularMediaDasNotas()); // Calcula e exibe a média das notas dos alunos
                        break;
                    case 4:
                        System.out.println("Encerrando o programa."); // Mensagem de encerramento do programa
                        break;
                    default:
                        System.out.println("Opção inválida. Escolha novamente."); // Mensagem de opção inválida
                }
            }
        }
    }
}