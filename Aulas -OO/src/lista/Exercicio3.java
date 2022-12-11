package lista;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		String op;
		int n1, n2;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com a operação a ser realizada (+, - ou *): ");
		op = input.next();
		System.out.println("Entre com o primeiro número: ");
		n1 = input.nextInt();
		System.out.println("Entre com o segundo número: ");
		n2 = input.nextInt();
		
		switch(op) {
		case "+": 
			System.out.println("O resultado da operação é: " + (n1+n2)); break;
		case "-": 
			System.out.println("O resultado da operação é: " + (n1-n2)); break;
		case "*": 
			System.out.println("O resultado da operação é: " + (n1*n2)); break;
		default:
			System.out.println("Operação inválida"); break;
		}
		
		input.close();
	}
}
