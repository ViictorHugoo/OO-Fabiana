package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Digite as informacoes do produto:");
		System.out.print("Nome: ");
		String nome = input.nextLine();
		System.out.print("Preco: ");
		double valor = input.nextDouble();
		System.out.print("Quantidade: ");
		int qtd = input.nextInt();
		
		Product produto = new Product(nome, valor, qtd);
		
		System.out.println();
		System.out.print("dados do produto: " + produto);
		
		System.out.println();
		System.out.print("Quantos produtos serao add ao estoque? ");
		qtd = input.nextInt();
		produto.addProduto(qtd);
		qtd = 0;
		
		System.out.println();
		System.out.print("dados do produto: " + produto);
		
		System.out.println();
		System.out.print("Quantos produtos serao rmv ao estoque? ");
		qtd = input.nextInt();
		produto.rmvProduto(qtd);
		qtd = 0;
		
		System.out.println();
		System.out.print("dados do produto: " + produto);
		
		input.close();
	}
}
