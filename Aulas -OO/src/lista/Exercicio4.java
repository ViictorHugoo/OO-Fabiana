package lista;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		int num, sum = 0;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero positivo para ser somado ou negativo para sair: ");
			num = input.nextInt();
			if(num > 0) {
			sum += num;
			}
			
		}while(num >= 0);
		
		System.out.println("A soma é: " + sum);
		input.close();
	}
}
