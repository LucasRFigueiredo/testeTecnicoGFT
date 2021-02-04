package poo.model;

import java.util.List;
import poo.model.Livro;
import poo.model.Produto;

public class Loja {
	private String nome;
	private String cnpj;
	private List<Livro> livros;
	private List<VideoGame> videoGames;

	public Loja() {
	}

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void listaLivros() {
		if (this.livros.size() > 0) {
			System.out.printf("A loja %s possui estes livros para venda: \n", this.nome);
			for (int i = 0; i < this.livros.size(); i++) {
				System.out.printf("Titulo: %s, preço: %.0f, quantidade: %d em estoque.\n", this.livros.get(i).getNome(),
						this.livros.get(i).getPreco(), this.livros.get(i).getQtd());
			}
		} else {
			System.out.printf("A loja %s não tem livros no seu estoque\n", this.nome);
		}
	}

	public void listaVideoGames() {
		if (this.videoGames.size() > 0) {
			System.out.printf("A loja %s possui estes video-games para venda: \n", this.nome);
			for (int i = 0; i < this.videoGames.size(); i++) {
				System.out.printf("Titulo: %s, preço: %.0f, quantidade: %d em estoque.\n",
						this.videoGames.get(i).getNome(), this.videoGames.get(i).getPreco(),
						this.videoGames.get(i).getQtd());
			}
		} else {
			System.out.printf("A loja %s não tem videogames no seu estoque\n", this.nome);
		}
	}

	public double calculaPatrimonio() {
		double patrimonio = 0;

		for (int i = 0; i < this.livros.size(); i++) {
			patrimonio += this.livros.get(i).getPreco() * this.livros.get(i).getQtd();
		}

		for (int i = 0; i < this.videoGames.size(); i++) {
			patrimonio += this.videoGames.get(i).getPreco() * this.videoGames.get(i).getQtd();
		}

		return patrimonio;
	}

}
