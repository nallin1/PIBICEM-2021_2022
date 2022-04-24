package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int n1;
		double n2;
		String s1;
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		n1 = myScanner.nextInt();
		
		System.out.println("Digite um número racional: ");
		n2 = myScanner.nextDouble();
		
		System.out.println("Digite uma cadeia de caractéres: ");
		s1 = myScanner.next();
		
		System.out.println("Os dados digitados são: " + n1 + ", " + n2 + ", " + s1);
	}

}
