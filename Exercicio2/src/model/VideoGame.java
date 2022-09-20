package model;

public class VideoGame extends Produto implements Imposto {

	private String Marca;
	private String Modelo;
	private boolean IsUsado;
	
	
	public VideoGame()
	{		
	}
	
	public VideoGame(String nome, double preco, int qtd,String marca, String modelo, boolean isUsado)
	{
		Nome = nome;
		Preco = preco;
		Qtd = qtd;
		Marca = marca;
		Modelo = modelo;
		IsUsado = isUsado;
	}
	
	
	@Override
       public double calculaImposto() {
		
		if(IsUsado == true)
		{
			return Preco * 0.25;
		}
		else
		{
		return Preco * 0.45;
		}
	}
		
			
	
	//get e set
	
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		this.Marca = marca;
	}
	
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		this.Modelo = modelo;
	}
	
	public boolean isIsUsado() {
		return IsUsado;
	}
	public void setIsUsado(boolean isUsado) {
		IsUsado = isUsado;
	}
	
		
}


