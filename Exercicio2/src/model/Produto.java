package model;

public abstract class Produto {
	
	protected String Nome;
	protected double Preco;
	protected int Qtd;
	
	
	
	public Produto()
	{
		
	}
	
	public Produto(String nome, double preco, int qtd) {
		Nome = nome;
		setPreco(preco);
		setQtd(qtd);
	}
	
	
	
	
	
	
	
	//get e set
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}

	public double getPreco() {
		return Preco;
	}

	public void setPreco(double preco) {
		Preco = preco;
	}

	public int getQtd() {
		return Qtd;
	}

	public void setQtd(int qtd) {
		Qtd = qtd;
	}
	

	
	
	
}
