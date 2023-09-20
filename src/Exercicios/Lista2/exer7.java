package Exercicios.Lista2;

import java.util.Scanner;

public class exer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a descrição do produto (nome): ");
        String descricaoProduto = scanner.nextLine();

        System.out.println("Digite a quantidade adquirida: ");
        int quantidadeAdquirida = scanner.nextInt();

        System.out.println("Digite o preço unitário: ");
        double precoUnitario = scanner.nextDouble();

        double total = quantidadeAdquirida * precoUnitario;
        double desconto = 0.0;

        if (quantidadeAdquirida <= 5) {
            desconto = total * 0.02; // Desconto de 2%
        } else if (quantidadeAdquirida > 5 && quantidadeAdquirida <= 10) {
            desconto = total * 0.03; // Desconto de 3%
        } else {
            desconto = total * 0.05; // Desconto de 5%
        }

        double totalAPagar = total - desconto;

        System.out.println("Descrição do Produto: " + descricaoProduto);
        System.out.println("Total: R$ " + total);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Total a Pagar: R$ " + totalAPagar);

        scanner.close();
    }
}
