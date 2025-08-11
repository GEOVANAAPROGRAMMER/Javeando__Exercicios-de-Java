package br.com.exercicios;

public class Ex1 {
	
	public static void main(String[] args) {

		int i = 10;          // OK — declaração e atribuição de um inteiro
		double d = i;        // OK — conversão implícita de int para double (widening)
//		float f = d;         -- ❌ ERRO — conversão de double para float requer **cast explícito**
		long l = i;          // OK — conversão implícita de int para long (widening)

		     
	}

}
