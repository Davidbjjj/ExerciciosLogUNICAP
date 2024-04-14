
package Usuario;

import java.util.ArrayList;
import java.util.Scanner;

// Classe para representar um aluno
class Aluno {
    int id;
    String nome;
    double nota;

    // Construtor para inicializar o ID, nome e nota do aluno
    public Aluno(int id, String nome, double nota) {
        this.id = id;
        this.nome = nome;
        this.nota = nota;
    }
}

// Classe que representa uma lista de alunos e fornece métodos para manipulá-la
class ListaDeAlunos {
    ArrayList<Aluno> alunos; // Lista de alunos representada por um ArrayList

    // Construtor para inicializar a lista de alunos
    public ListaDeAlunos() {
        this.alunos = new ArrayList<>();
    }

    // Método para adicionar um novo aluno à lista
    public void adicionarAluno() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ID do aluno:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();
        System.out.println("Digite a nota do aluno:");
        double nota = scanner.nextDouble();

        Aluno aluno = new Aluno(id, nome, nota);
        alunos.add(aluno); // Adiciona o aluno à lista
    }

    // Método para buscar um aluno por ID na lista
    public Aluno buscarAlunoPorId(int id) {
        for (Aluno aluno : alunos) {
            if (aluno.id == id) {
                return aluno; // Retorna o aluno se encontrado
            }
        }
        return null; // Retorna null se o aluno não for encontrado
    }

    // Método para calcular a média das notas dos alunos na lista
    public double calcularMediaDasNotas() {
        double soma = 0;
        for (Aluno aluno : alunos) {
            soma += aluno.nota;
        }
        return soma / alunos.size(); // Retorna a média das notas
    }
}
