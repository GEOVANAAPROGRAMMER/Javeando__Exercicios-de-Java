package br.com.exercicios.scanner;

import java.util.Scanner;

public class Ex9_Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número N (0 para sair): ");
            int n = sc.nextInt();

            if (n == 0) {
                System.out.println("Programa encerrado.");
                break;
            }

            if (n < 0) {
                System.out.println("Por favor, digite um número positivo.");
                continue;
            }

            // Imprimir os primeiros N termos de Fibonacci
            int a = 0, b = 1;
            System.out.print("Sequência de Fibonacci: ");

            for (int i = 1; i <= n; i++) {
                System.out.print(a);
                if (i < n) System.out.print(", ");
                int proximo = a + b;
                a = b;
                b = proximo;
            }
            System.out.println(); // nova linha após a sequência
        }

        sc.close();
    }
}
