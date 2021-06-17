package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		System.out.println("Adição de dois números inteiros");
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int soma;

		System.out.print("Insira um número: ");
		int n1 = sc.nextInt();
		System.out.print("Insira outro número: ");
		int n2 = sc.nextInt();
		sc.close();

		soma = n1 + n2;

		System.out.println("A soma entre " + n1 + " e " + n2 + " é igual a: " + soma);
	}

}
