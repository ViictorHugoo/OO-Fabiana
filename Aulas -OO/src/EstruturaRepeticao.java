import java.util.Scanner;

public class EstruturaRepeticao {
	public static void main(String[] args) {
		
		int vetInt[] = new int[10];
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite 10 numeros inteiros");
		
		for(int i = 0; i < 10; ++i) {
			vetInt[i] = entrada.nextInt();
		}
		
		entrada.close();
		
		System.out.print("Os numeros digitados foram: ");
		for(int i = 0; i < 10; ++i) {
			System.out.print(vetInt[i] + " ");
		}
	}
}
