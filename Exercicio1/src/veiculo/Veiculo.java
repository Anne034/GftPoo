package veiculo;

public class Veiculo {

	private String Marca;
	private String Modelo;
	private String Placa;
	private String cor;
	private float Km;
	private boolean IsLigado;
	private int LitrosCombustivel;
	private int Velocidade;
	private double Preco;
	
	//methods
	public void acelerar()
	{
		Velocidade += 20;
	}
	public void abastecer(int combustivel)
	{
		LitrosCombustivel += combustivel;
		if(LitrosCombustivel > 60)
		{
			LitrosCombustivel = 60;
		}
	}
	public void frear()
	{
		Velocidade -= 20; //fodase
		
		if (Velocidade < 0) {
			
			Velocidade = 0;
		}
				
	}
	
	public void pintar(String cor)
	{
		this.cor = cor;
	}
	public void ligar()
	{
		if (IsLigado == false) {
			IsLigado = true;
		}
			
	}
	public void desligar()
	{
		if (IsLigado == true && Velocidade == 0) {
			IsLigado = false;
		
		}
			
	}
	
	//getters and setters
	
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
		
	}
	public float getKm() {
		return Km;
	}
	public void setKm(float km) {
		Km = km;
	}
	public boolean isIsLigado() {
		return IsLigado;
	}
	public void setIsLigado(boolean isLigado) {
		IsLigado = isLigado;
	}
	public int getLitrosCombustivel() {
		return LitrosCombustivel;
	}
	public void setLitrosCombustivel(int litrosCombustivel) {
		LitrosCombustivel = litrosCombustivel;
	}
	public double getPreco() {
		return Preco;
	}
	public void setPreco(double preco) {
		Preco = preco;
	}
	public int getVelocidade() {
		return Velocidade;
	}
	public void setVelocidade(int velocidade) {
		Velocidade = velocidade;
	}
		
}
