package exercicios.alura;

import java.util.Scanner;

public class OlaMundo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		Exercício 1
		System.out.println("Exercício 1 :  Olá Mundo!");
		
//		Exercício 2
		int soma = 74 + 36;
		System.out.println("Exercício 2 :  soma ("+ soma +")");
		
//		Exercício 3
		
		System.out.println("Digite um número: ");
		double num = sc.nextDouble();
		
		System.out.println("Digite um segundo número: ");
		double num2 = sc.nextDouble();
		
		if (num2 != 0) {
			double div = num / num2;
			System.out.println("Exercício 3 :  divisão (" + div + ")");
		} else {
			System.out.println("Não é possível realizar divisões por 0.");
		}
		
		
//		Exercício 4
		double a = -5+8*6;
		double b = (55 +9) % 9;
		double c = 20 + -3 *5/8;
		double d = 5 + 15 / 3*2 - 8 % 3;
		
		System.out.println("Exercício 4");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
//		Exercício 5

		System.out.println("Digite um número: ");
		double numero = sc.nextDouble();
		
		System.out.println("Digite um segundo número: ");
		double numero2 = sc.nextDouble();

		System.out.println("Exercício 5 :");
		System.out.println(numero + numero2);
		System.out.println(numero - numero2);
		System.out.println(numero * numero2);
		System.out.println(numero / numero2);	
		
		
//		Exercício 6
		System.out.println("Digite um número: ");
		int mult = sc.nextInt();
		System.out.println("Exercício 6 : Tabuada do :" + mult);
		
		for(int i = 1; i <= 10; i++ ) {
			System.out.println(mult * i);
		}
		
		
//		Exercício 7
		System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
		
		
//		Exercício 8		
        double result = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		System.out.println(result);
		
		
//		Exercício 9
		System.out.print("Digite um número: ");
		int numeroB = sc.nextInt();

		String binario = "";

		while (numeroB > 0) {
		    int resto = numeroB % 2;
		    binario = resto + binario; // adiciona na frente
		    numeroB = numeroB / 2;
		}

		System.out.println("O número binário é: " + binario);
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
