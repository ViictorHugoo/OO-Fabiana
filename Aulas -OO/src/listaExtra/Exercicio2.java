package listaExtra;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		String caracter;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o caractere a ser conferido: ");
		caracter = input.next();
		
		if(caracter.matches("[0-9]")) {
			System.out.println(caracter + " eh um numero");
		} else if (caracter.matches("[a-z]")) {
			System.out.println(caracter + " eh uma letra minuscula");
		} else if (caracter.matches("[A-Z]")){
			System.out.println(caracter + " eh uma letra maiuscula");
		} else {
			System.out.println(caracter + " eh um caracter qualquer");
		}

		input.close();
	}

}
