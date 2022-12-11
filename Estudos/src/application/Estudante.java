package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Estudante {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student estudante = new Student();
		
		System.out.println("Digite as informacoes do estudante: ");
		System.out.print("Nome: ");
		estudante.nome = sc.nextLine();
		System.out.println("Notas: ");
		estudante.nota1 = sc.nextDouble();
		estudante.nota2 = sc.nextDouble();
		estudante.nota3 = sc.nextDouble();
		
		double Missing = 60 - estudante.nota1 - estudante.nota2 - estudante.nota3;
		
		if(estudante.situacao() == true) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.println("Missing: " + Missing);
		}
		
		sc.close();
	}
}
