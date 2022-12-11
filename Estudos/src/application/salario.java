package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Salary;

public class salario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Salary funcionario = new Salary();
		
		System.out.println("Digites os dados do funcionario: ");
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salario: ");
		funcionario.salario = sc.nextDouble();
		System.out.print("Taxa: ");
		funcionario.taxa = sc.nextDouble();
	
		System.out.println();
		System.out.println("Funcionario: " + funcionario);
		System.out.println();
		
		System.out.println("Qual a porcentagem de aumento do salario?");
		double porcentagem = sc.nextDouble();
		funcionario.aumentarSalario(porcentagem);
		System.out.println();
		
		System.out.println("Funcionario: " + funcionario);
		
		sc.close();
	}

}
