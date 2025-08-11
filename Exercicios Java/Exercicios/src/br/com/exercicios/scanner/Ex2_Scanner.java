package br.com.exercicios.scanner;

import java.util.Scanner;

public class Ex2_Scanner {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		 // Consumir o ENTER que ficou no buffer
        sc.nextLine();
		System.out.println("Digite sua cidade: ");
		String cidade = sc.nextLine();
		
		System.out.println("Meu nome é "+ nome + ", tenho "+ idade + " ano(s), e moro na cidade de "+ cidade + ".");
		
		sc.close();
		
	}

}
