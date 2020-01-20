package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program09 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		Product product = new Product(name, price);	
		
		System.out.println();
		System.out.println("Product data: " + product.toString());
		
		System.out.println();
		System.out.print("Enter the number the products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProdutcs(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product.toString());

		System.out.println();
		System.out.print("Enter the number the products to be romoved from stock: ");
		quantity = sc.nextInt();
		product.removeProdutcs(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product.toString());
		
		
		sc.close();

	}

}
