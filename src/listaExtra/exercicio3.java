package listaExtra;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, b, c, delta = 0, x1 = 0, x2 = 0;
		
		System.out.println("Digite o termo a: ");
		a = input.nextDouble();
		System.out.println("Digite o termo b: ");
		b = input.nextDouble();
		System.out.println("Digite o termo c: ");
		c = input.nextDouble();
		
		delta = b*b - 4*a*c;
		
		if(delta > 0) {
			x1= (-b + Math.sqrt(delta))/2*a;
			x2= (-b - Math.sqrt(delta))/2*a;
			System.out.println("Possui duas raizes reais que são: X1 = " + x1 + "e X2 = " + x2);
		} else if(delta == 0) {
			x1= (-b + Math.sqrt(delta))/2*a;
			System.out.println("Possui apenas uma raiz real: X1 = " + x1);
		} else {
			System.out.println("Não possui raizes reais ");
		}
		
		input.close();
	}
}
