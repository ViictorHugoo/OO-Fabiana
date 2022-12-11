import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		int num;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite 1, 2 ou 3");
		num = entrada.nextInt();
		
		switch(num) {
		case 1: 
			System.out.print("Voce digitou o numero 1"); break;
		case 2: 
			System.out.print("Voce digitou o numero 2"); break;
		case 3:
			System.out.print("Voce digitou o numero 3"); break;
		default: 
			System.out.print("Voce nao digitou 1, 2 ou 3"); break;
		}
		
		entrada.close();
	}
}
