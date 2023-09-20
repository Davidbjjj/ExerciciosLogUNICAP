package Exercicios.Lista2;

import java.util.Scanner;

public class exer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de litros vendidos: ");
        double litrosVendidos = scanner.nextDouble();

        System.out.println("Digite o tipo de combustível (E para Etanol, G para Gasolina): ");
        char tipoCombustivel = scanner.next().charAt(0);

        double precoGasolina = 4.02;
        double precoEtanol = 3.24;

        double valorAPagar = 0.0;

        if (tipoCombustivel == 'E' || tipoCombustivel == 'e') {
            if (litrosVendidos <= 20) {
                valorAPagar = litrosVendidos * precoEtanol * 0.97; // Desconto de 3%
            } else {
                valorAPagar = litrosVendidos * precoEtanol * 0.95; // Desconto de 5%
            }
        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
            if (litrosVendidos <= 20) {
                valorAPagar = litrosVendidos * precoGasolina * 0.96; // Desconto de 4%
            } else {
                valorAPagar = litrosVendidos * precoGasolina * 0.94; // Desconto de 6%
            }
        } else {
            System.out.println("Tipo de combustível inválido. Use 'E' para Etanol ou 'G' para Gasolina.");
            scanner.close();
            return;
        }

        System.out.println("Valor a ser pago pelo cliente: R$ " + valorAPagar);

        scanner.close();
    }
}
