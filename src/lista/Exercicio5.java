package lista;
import java.util.Scanner;

public class Exercicio5 {
	
	public static boolean ePar(int a) {
		if(a%2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o numero:");
		num = input.nextInt();
		
		System.out.println(ePar(num));
		
		input.close();
	}
}
