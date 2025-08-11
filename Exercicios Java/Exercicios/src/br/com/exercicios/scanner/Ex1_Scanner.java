package br.com.exercicios.scanner;

import java.util.Scanner;

public class Ex1_Scanner {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		
		System.out.println("Olá, "+ nome + "! Seja bem vindo ao mundo do Java.");
		
		sc.close();
		
	}

}
