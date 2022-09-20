package personagem;

public class Personagem {
	
	protected String Nome;
	protected int Vida;
	protected int Mana;
	protected float Xp;
	protected int Inteligencia;
	protected int Forca;
	protected int level;
		
	
	public void LvlUp()
	{
		level++;
	}
	
	//get e set
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public int getVida() {
		return Vida;
	}
	public void setVida(int vida) {
		Vida = vida;
	}
	public int getMana() {
		return Mana;
	}
	public void setMana(int mana) {
		Mana = mana;
	}
	public float getXp() {
		return Xp;
	}
	public void setXp(float xp) {
		Xp = xp;
	}
	public int getInteligencia() {
		return Inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		Inteligencia = inteligencia;
	}
	public int getForca() {
		return Forca;
	}
	public void setForca(int forca) {
		Forca = forca;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
		
	
}
