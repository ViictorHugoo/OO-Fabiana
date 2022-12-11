package application;

import java.util.Scanner;

public class Ticket {
	private String data;
	private String destino;
	private String hora_embarque;
	private String local_embarque;
	private double valor;
	// status = true significa que o ticket já foi usado e é, portanto, invalido
	private boolean status = false;

	public Ticket(String data, String destino, String hora_embarque, String local_embarque, double valor) {
		this.data = data;
		this.destino = destino;
		this.hora_embarque = hora_embarque;
		this.local_embarque = local_embarque;
		this.valor = valor;
	}

	public String validador() {
		// coloque aqui o código do método que valida um ticket
		if(status == true) {
			return "Ticket invalido";
		} else {
			return "Ticket valido";
		}
	}

	public void invalidar() {
		status = true;
	}

	public String toString() {
		// coloque aqui o código do método toString
		return "Data = " + data 
				+ "\nDestino = " + destino 
				+ "\nHorario = " + hora_embarque 
				+ "\nLocal de embarque = " + local_embarque 
				+ "\nValor = R$ " + valor 
				+ "\n" + validador();
	}

	// Você não precisa alterar esse método.
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		String data = entrada.next();
		String destino = entrada.next();
		String horario = entrada.next();
		String embarque = entrada.next();
		double valor = entrada.nextDouble();
		Ticket t = new Ticket(data, destino, horario, embarque, valor);
		
		System.out.println(t.validador());
		t.invalidar();
		System.out.println(t.toString());
	}
}
