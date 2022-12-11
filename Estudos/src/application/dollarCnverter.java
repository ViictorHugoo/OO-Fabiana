package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class dollarCnverter {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor do dolar: ");
		double dollar = sc.nextDouble();
		System.out.print("Valor da compra: ");
		double reais = sc.nextDouble();
		System.out.println("Valor a ser pago: " + Calculator.converter(dollar, reais));
		
		sc.close();
	}
}
