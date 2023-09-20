package Exercicios.Lista2;

import java.util.Scanner;

public class exer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaRenda = 0.0;
        int totalHabitantes = 0;
        int totalFilhos = 0;
        double maiorSalario = Double.MIN_VALUE;
        int habitantesComRendaMenor200 = 0;

        while (true) {
            System.out.println("Digite a renda do habitante (ou um valor negativo para encerrar): ");
            double renda = scanner.nextDouble();

            if (renda < 0) {
                break;
            }

            System.out.println("Digite o número de filhos do habitante: ");
            int filhos = scanner.nextInt();

            somaRenda += renda;
            totalHabitantes++;
            totalFilhos += filhos;

            if (renda > maiorSalario) {
                maiorSalario = renda;
            }

            if (renda < 200) {
                habitantesComRendaMenor200++;
            }
        }

        if (totalHabitantes > 0) {
            double rendaMedia = somaRenda / totalHabitantes;
            double mediaFilhos = (double) totalFilhos / totalHabitantes;
            double percentualMenor200 = (double) habitantesComRendaMenor200 / totalHabitantes * 100;

            System.out.println("Renda média da população: " + rendaMedia);
            System.out.println("Média do número de filhos: " + mediaFilhos);
            System.out.println("Maior salário dos habitantes: " + maiorSalario);
            System.out.println("Percentual de habitantes com renda menor que R$ 200,00: " + percentualMenor200 + "%");
        } else {
            System.out.println("Nenhum dado foi inserido.");
        }

        scanner.close();
    }
}
