package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product02;

public class Program11 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product02[] vect = new Product02[n];
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product02(name, price);
						
		}
		
		double soma = 0.0;
		for(int i=0; i<vect.length; i++) {
			soma += vect[i].getPrice();
						
		}
		double media = soma / vect.length;
		
		System.out.printf("Média dos preços dos produtos: %.2f%n", media);
		
		sc.close();

	}

}
