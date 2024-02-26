package main.java;

import java.util.Scanner;

public class q5P2 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int limite = 18;
    int pesoLivro;
    int total = 0;
    int quantidadeLivros = 0;

    System.out.println("Diga o peso dos livros:");

    while (total <= limite) {
        pesoLivro = scanner.nextInt();
        if (pesoLivro <= 0) {
            break;
        }
        total += pesoLivro;
        if (total <= limite) {
            quantidadeLivros++;
        } else {
            total -= pesoLivro;
            break;
        }
    }
    System.out.println("Quantidade de livros : " + quantidadeLivros);
    }
}