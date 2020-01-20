package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		System.out.print("Name: ");
		func.funcionario = sc.nextLine();
		System.out.print("Gross salary: ");
		func.salarioBruto = sc.nextDouble();
		System.out.print("Tax: ");
		func.taxa = sc.nextDouble();
		System.out.println();
		
		System.out.println("Employee: " + func.funcionario + ", $ " + func.salarioLiquido());
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		func.aumentoSalario(percentage);
		System.out.println();
		System.out.println("Update data: " + func);
		
		
		sc.close();

	}

}
