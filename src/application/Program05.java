package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student aluno = new Student();
		
		aluno.aluno = sc.nextLine();
		
		aluno.grade1 = sc.nextDouble();
		while(aluno.grade1 > 30.0) {
			System.out.print("NOTA NÃO PODE SER MAIOR QUE 30.0, DIGITE NOVAMENTE: ");
			aluno.grade1 = sc.nextDouble();			
		}
		aluno.grade2 = sc.nextDouble();
		while(aluno.grade2 > 35.0) {
			System.out.print("NOTA NÃO PODE SER MAIOR QUE 35.0, DIGITE NOVAMENTE: ");
			aluno.grade2 = sc.nextDouble();			
		}
		aluno.grade3 = sc.nextDouble();
		while(aluno.grade3 > 35.0) {
			System.out.print("NOTA NÃO PODE SER MAIOR QUE 35.0, DIGITE NOVAMENTE: ");
			aluno.grade3 = sc.nextDouble();			
		}
		System.out.printf("FINAL GRADE: %.2f%n", aluno.finalGrade());
		
		if(aluno.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f%n", aluno.missingPoints(), " POINTS");
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();

	}

}
