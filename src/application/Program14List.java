package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program14List {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Quantos funcionários serão registrados? ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println();
			System.out.println("Emplyoee #" + i + ":");
			System.out.print("Id: ");
			int matr = sc.nextInt();
			System.out.print("Nome do Funcinario: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salary = sc.nextDouble();
			list.add(new Employee(matr, nome, salary));
							
			}
		System.out.println();
		System.out.println("Digite a identificação do funcionário que terá aumento de salário: ");
		int matr = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == matr).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("Este ID nao existe!");
		}
		else {
			System.out.println("Digite a porcentagem para aumento: ");
			double porcentagem = sc.nextDouble();
			emp.addSalary(porcentagem);
		}
		System.out.println();
		System.out.println("Lista de Funcionarios: ");
		for(Employee obj : list) {
			System.out.println(obj);
		}
		sc.close();

	}
}