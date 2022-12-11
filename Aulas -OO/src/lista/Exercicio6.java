package lista;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		int vetInt[] = new int[5];
		Scanner input = new Scanner(System.in);
		int max = 0;
		
		System.out.println("Entre com o primeiro numero:");
		vetInt[0] = input.nextInt();
		System.out.println("Entre com o segundo numero:");
		vetInt[1] = input.nextInt();
		System.out.println("Entre com o terceiro numero:");
		vetInt[2] = input.nextInt();
		System.out.println("Entre com o quarto numero:");
		vetInt[3] = input.nextInt();
		System.out.println("Entre com o quinto numero:");
		vetInt[4] = input.nextInt();
		
		for(int i = 0; i < 5; ++i) {
			if(vetInt[i] > max) {
				max = vetInt[i];
			}
		}
		
		System.out.println(max);
		
		input.close();
	}
}
