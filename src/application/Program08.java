package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;


public class Program08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
				
		System.out.print("What is the dollar price? ");
		double valorMoeda = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		valorMoeda = sc.nextDouble();
		
		double b = CurrencyConverter.valorDeCompra(valorMoeda);
		
		System.out.printf("Amount to be paid in reais (R$) = %.2f%n", b);
		
		sc.close();

	}

}
