package br.com.exercicios.scanner;

import java.util.Scanner;

public class Ex7_NumerosPrimos {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double num = sc.nextDouble();
		
		if (num % 2 == 0) {
			System.out.println("O número é par! ");
		} else {
			System.out.println("O número é impar! ");
		} 
		
		sc.close();
	}

}
