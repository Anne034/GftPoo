package personagem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {
	
	private List<String> Habilidade;
	
	public Guerreiro()
	{
		Habilidade = new ArrayList<String>();
	}

	
	@Override
	public void LvlUp()
	{
		Vida++;
		Forca++;
		super.LvlUp();
	}
	
	public int Attack()
	{
		 Random gerador = new Random();
		 return (Forca * level) + gerador.nextInt(300);
	}
	
	public List<String> getHabilidade() {
		return Habilidade;
	}

	public void setHabilidade(List<String> habilidade) {
		Habilidade = habilidade;
	}
	
	public void AprenderHabilidade(String habilidade)
	{
		Habilidade.add(habilidade);
	}

}
