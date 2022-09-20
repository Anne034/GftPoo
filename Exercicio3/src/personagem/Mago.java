package personagem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem {

	private List<String> Magia;
	
	public Mago()
	{
		Magia = new ArrayList<String>();
	}

	
	@Override
	public void LvlUp()
	{
		Mana++;
		Inteligencia++;
		super.LvlUp();
	}
	
	public int Attack()
	{
		 Random gerador = new Random();
		 return (Inteligencia * level) + gerador.nextInt(300);
	}
	
	public void AprenderMagia(String magia)
	{
		Magia.add(magia);
	}

	//Getters and Setters
	public List<String> getMagia() {
		return Magia;
	}

	public void setMagia(List<String> magia) {
		Magia = magia;
	}
}
