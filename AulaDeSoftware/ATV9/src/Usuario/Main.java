package Usuario;
import java.util.Scanner;

// Classe principal que contém o método main para execução do programa
public class Main {
    public static void main(String[] args) {
        ListaDeAlunos lista = new ListaDeAlunos(); // Instância da classe ListaDeAlunos para manipular a lista de alunos
        Scanner scanner = new Scanner(System.in); // Instância de Scanner para entrada do usuário

        System.out.println("Quantos alunos deseja adicionar?"); // Solicita ao usuário que insira a quantidade de alunos a adicionar
        int quantidade = scanner.nextInt(); // Lê a quantidade de alunos a adicionar

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Aluno " + (i + 1) + ":"); // Solicita ao usuário que insira os dados do aluno atual
            lista.adicionarAluno(); // Chama o método para adicionar um novo aluno à lista
        }

        System.out.println("Média das notas: " + lista.calcularMediaDasNotas()); // Exibe a média das notas dos alunos na lista
    }
}
