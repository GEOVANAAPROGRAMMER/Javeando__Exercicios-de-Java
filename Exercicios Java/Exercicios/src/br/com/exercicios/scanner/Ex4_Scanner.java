package br.com.exercicios.scanner;

import java.util.Scanner;

public class Ex4_Scanner {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá amigo! Digite a temperatura (Celsius) que está fazendo em sua cidade hoje: ");
		
		double C = sc.nextDouble();
		double Fahrenheit = C * 1.8 + 32;
		
		System.out.println("Este é o valor da temperatura em Fahrenheit: "+ Fahrenheit);
		
		sc.close();
		
	}

}
