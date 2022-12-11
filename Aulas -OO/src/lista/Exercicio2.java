package lista;
import java.util.Scanner;

public class Exercicio2 {
	 public static void main(String[] args) {
	        int dia;
	        int mes;
	        int ano;
	        
	        Scanner ler = new Scanner(System.in);
	        System.out.print("Digite o dia:\n");    
	        dia = ler.nextInt();
	        System.out.print("Digite o mes:\n");
	        mes = ler.nextInt();
	        System.out.print("Digite o ano:\n");
	        ano = ler.nextInt();
	        
	        if(dia < 1 || dia > 29){
	            System.out.println("Data Inválida");
	        } else if(ano%4 == 0 && ano%100 != 0 || ano%400 == 0){ 
	            System.out.println("Data Válida. A data digitada foi: " + dia + "/" + mes + "/" + ano);
	        } else {
	            System.out.println("Data Inválida");
	            }
	        
	        ler.close();
	 }
}