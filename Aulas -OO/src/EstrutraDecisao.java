import java.util.Scanner;

public class EstrutraDecisao {
	public static void main(String[] args) {
		int n1, n2;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		n1 = entrada.nextInt();
		System.out.print("Digite o segundo numero: ");
		n2 = entrada.nextInt();
		
		System.out.println("O maior numero e: " + (n1 > n2 ? "n1" : "n2") + " (ternario)");
		
		if(n1 > n2) {
			System.out.print("n1 e o maior numero");
		} else if (n2 > n1) {
			System.out.print("n2 e o maior numero");
		} else {
			System.out.print("os numeros sao iguais");
		}
		
		entrada.close();
	}
}
