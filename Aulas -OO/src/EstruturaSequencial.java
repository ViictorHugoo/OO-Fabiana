import java.util.Scanner;

public class EstruturaSequencial {
	public static void main(String[] args) {
		double a1, a2, a3;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a 1a altura: ");
		a1 = entrada.nextDouble();
		System.out.print("Digite a 2a altura: ");
		a2 = entrada.nextDouble();
		System.out.print("Digite a 3a altura: ");
		a3 = entrada.nextDouble();
		
		System.out.println("As alturas digitadas foram: " + a1 + ", " + a2 + ", " + a3);
		
		System.out.println("A media das alturas e: " + (a1+a2+a3)/3);
		
		entrada.close();
	}
}
