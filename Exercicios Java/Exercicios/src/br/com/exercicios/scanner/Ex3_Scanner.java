package br.com.exercicios.scanner;

import java.util.Scanner;

public class Ex3_Scanner {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int numUm = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int numDois = sc.nextInt();
		
		System.out.println("Resultado: "+ (numUm + numDois));
		
		sc.close();
	}

}
