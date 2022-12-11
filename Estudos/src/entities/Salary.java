package entities;

public class Salary {
	public String nome;
	public double salario;
	public double taxa;
	
	public double salarioLiquido() {
		return salario - taxa;
	}
	
	public void aumentarSalario(double porcentagem) {
		double aumento = (salario/100)*porcentagem;
		salario += aumento;
	}
	
	public String toString() {
		return nome + ", $" + String.format("%.2f", salarioLiquido());
	}
}
