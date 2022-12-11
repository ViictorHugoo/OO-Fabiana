package listaExtra;
import java.util.Scanner;

//verifica o valor da multa por excesso de velocidade

public class Exercicio1 {
	public static void main(String[] args) {
		int speed, maxspeed, multa;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a velocidade maxima permitida: ");
		maxspeed = input.nextInt();
		System.out.println("Digite a velocidade do carro: ");
		speed = input.nextInt();
		
		speed -= maxspeed;
		
		if(speed <= 0) {
			multa = 0;
		} else if (speed <= 10) {
			multa = 50;
		} else if (speed <= 30) {
			multa = 100;
		} else {
			multa = 200;
		}
		
		System.out.println("A multa a ser paga e de: " + multa);
		
		input.close();
	}
}
