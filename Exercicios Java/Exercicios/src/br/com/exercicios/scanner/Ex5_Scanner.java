package br.com.exercicios.scanner;

import java.util.Scanner;

public class Ex5_Scanner {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		float peso = sc.nextFloat();
		
		System.out.println("Digite sua altura: ");
		float altura = sc.nextFloat();
		
		float imc = peso / (altura * altura);
		
		System.out.printf("IMC: %.2f%n", imc);
		
		if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }
		
		sc.close();
		
	}
	
}
