package model;

import java.util.List;

public class Loja {

	private String Nome;
	private String Cnpj;

	private List<Livro> Livros;
	private List<VideoGame> VideoGames;

	public Loja() {
	}

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {

		Nome = nome;
		Cnpj = cnpj;
		Livros = livros;
		VideoGames = videoGames;
	}

	public void ListaLivros() {
		for (Livro livro : Livros) {
			System.out.println(livro.getNome());
		}
	}

	public void ListaVideoGame() {
		for (VideoGame videoGame : VideoGames) {
			System.out.println(videoGame.getMarca());
		}
	}

	public double calculaPatrimonio()
	{
		double soma = 0;
		for (Livro livro : Livros) {
			soma += livro.getPreco();
		}
		for (VideoGame videoGame : VideoGames) {
			soma += videoGame.getPreco();
			
	}
             return soma;

}

//Get e set

	private String getNome() {
		return Nome;
	}

	private void setNome(String nome) {
		Nome = nome;
	}

	private String getCnpj() {
		return Cnpj;
	}

	private void setCnpj(String cnpj) {
		Cnpj = cnpj;
	}


}
