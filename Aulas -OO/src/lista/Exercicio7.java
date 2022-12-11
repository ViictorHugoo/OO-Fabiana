package lista;
import java.util.Scanner;

public class Exercicio7 {
	
	public static boolean dig(String a) {
		if(a.matches("[0-9]")) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		String caracter;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o caracter a ser verificado: ");
		caracter = input.next();
		
		System.out.println(dig(caracter));
		
		input.close();
	}
}
