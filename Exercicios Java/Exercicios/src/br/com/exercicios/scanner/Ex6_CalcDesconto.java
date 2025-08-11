package br.com.exercicios.scanner;

import java.util.Scanner;

public class Ex6_CalcDesconto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		double preco = sc.nextDouble();
		
		System.out.println("Digite o valor do desconto em porcentagem: ");
		double desc = sc.nextDouble();
		
		double valorDesconto = preco * (desc / 100);
		double precoFinal = preco - valorDesconto;
		
		System.out.printf("O valor do desconto é: R$ %.2f%n", valorDesconto);
        System.out.printf("O preço final do produto com desconto é: R$ %.2f%n", precoFinal);
        
        sc.close();
	}
}
