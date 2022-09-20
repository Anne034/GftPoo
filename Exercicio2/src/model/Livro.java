package model;

public class Livro extends Produto implements Imposto {
	
	private String Autor;
	private String Tema;
	private int QtdPag;

	
	
	
	public Livro()
	{		
	}
	
	public Livro(String nome, double preco, int qtd,String autor, String tema, int qtdPag) {
		Nome = nome;
		Preco = preco;
		Qtd = qtd;
		Autor = autor;
		Tema = tema;
		QtdPag = qtdPag;
	}
	
	
	
	@Override
	public double calculaImposto() {
	
		
		if(Tema == "educativo")
		{
			return 0;
		}
		else
		{
			return Preco * 0.1;
		}
	}
	
	
	
	
	
	
	//getters and setters
	
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	
	public String getTema() {
		return Tema;
	}
	
	public void setTema(String tema) {
		Tema = tema;
	}

	public int getQtdPag() {
		return QtdPag;
	}

	public void setQtdPag(int qtdPag) {
		QtdPag = qtdPag;
	}
	
	


	
	
	

	
	
	
}