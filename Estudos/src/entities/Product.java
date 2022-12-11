package entities;

public class Product {
		
	private String nome;
	private double valor;
	private int qtd;
	
	public Product(String nome, double valor, int qtd) {
		this.nome = nome;
		this.valor = valor;
		this.qtd = qtd;
	}
	public Product(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	public Product() {
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int getQtd() {
		return qtd;
	}
	
	public double valorTotalEstoque() {
		return valor*qtd;
	}
		
	public void addProduto (int qtd) {
		this.qtd += qtd;
	}
		
	public void rmvProduto (int qtd) {
		this.qtd -= qtd;
	}
	
	public String toString() {
		return nome
				+ ", $"
				+ valor
				+ ", "
				+ qtd
				+ " produtos, $"
				+ valorTotalEstoque();
	}
	
}
