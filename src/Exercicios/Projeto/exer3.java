package Exercicios.Projeto;
/** Estudantes: David Pontes Vieira Da Silva
 Juliana Coroline da Cunha Oliveira*/
import java.util.Scanner;
public class exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

       System.out.print("Digite um número entre 1 e 10: ");
       numero = scanner.nextInt();

        while (numero < 1 || numero > 10);

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
