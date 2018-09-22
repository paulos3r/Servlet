package br.com.web.modelo;

public class Livro {
	String altor;
	String titulo;
	String descricao;
	
	
	public Livro(String altor, String titulo, String descricao) {
		super();
		this.altor = altor;
		this.titulo = titulo;
		this.descricao = descricao;
	}
	
	public Livro() {
		super();
	}

	public String getAltor() {
		return altor;
	}
	public void setAltor(String altor) {
		this.altor = altor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
