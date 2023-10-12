package Exercicios.Lista2;

import java.util.Scanner;

public class exer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double smRenda = 0.0;
        int ttlHabitantes = 0;
        int ttlFilhos = 0;
        double maiorSalario = Double.MIN_VALUE;
        int habtmn200 = 0;

        while (true) {
            System.out.println("Digite a renda do habitante (ou um valor negativo para encerrar): ");
            double renda = scanner.nextDouble();

            if (renda < 0) {
                break;
            }

            System.out.println("Digite o número de filhos do habitante: ");
            int filhos = scanner.nextInt();

            smRenda += renda;
            ttlHabitantes++;
            ttlFilhos+= filhos;

            if (renda > maiorSalario) {
                maiorSalario = renda;
            }

            if (renda < 200) {
                habtmn200++;
            }
        }

        if (ttlHabitantes > 0) {
            double rendaMedia = smRenda / ttlHabitantes;
            double mediaFilhos = (double) ttlFilhos / ttlHabitantes;
            double percentualMenor200 = (double) habtmn200 / ttlHabitantes * 100;

            System.out.println("Renda médi" +
                    "0, da população: " + rendaMedia);
            System.out.println("Média do número de filhos: " + mediaFilhos);
            System.out.println("Maior salário dos habitantes: " + maiorSalario);
            System.out.println("Percentual de habitantes com renda menor que R$ 200,00: " + percentualMenor200 + "%");
        } else {
            System.out.println("Nenhum dado foi inserido.");
        }

        scanner.close();
    }
}
