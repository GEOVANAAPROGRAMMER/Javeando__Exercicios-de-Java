package br.com.exercicios.scanner;

import java.util.Scanner;

public class Ex8_InversorDeString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra ou frase: ");
		String frase = sc.nextLine();
		
		String inverso = "";

		for (int i = frase.length() - 1; i >= 0; i--) {
			inverso += frase.charAt(i);
		}
		
		System.out.println("Texto invertido: " + inverso);
		
		sc.close();
	}

}
