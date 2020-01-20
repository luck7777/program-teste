package application;

import java.util.Scanner;

import entities.Hospedes;

public class Program12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Hospedes vect[] = new Hospedes[10];
		
		for(int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Cliente #" + i +": ");
			System.out.print("Qual seu nome: ");
			sc.nextLine();
			String hospede = sc.nextLine();
			System.out.print("Qual seu E-mail: ");
			String email = sc.nextLine();
			System.out.print("Digite o numero do quarto que deseja, sendo de 0 a 9: ");
			int room = sc.nextInt();
			while(vect[room] != null) {
				System.out.print("Quarto ocupado, favor escolher outro, sendo de 0 a 9: ");
				room = sc.nextInt();
			}
			vect[room] = new Hospedes(hospede, email);			
		}
		System.out.println("Quartos ocupados:");
		for(int i=0; i<vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

		
		sc.close();
	}

}
