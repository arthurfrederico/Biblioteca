package br.com.livros.biblioteca.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "livros")
public class Biblioteca {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="codid")
	private int codid;
	
	@Column(name="titulo", length = 100)
	private String titulo;
	
	@Column(name="autor", length = 100)
	private String autor;
	
	@Column(name="ano")
	private int ano;
	
	@Column(name="genero", length = 30)
	private String genero;
	

	public int getCodid() {
		return codid;
	}

	public void setCodid(int codid) {
		this.codid = codid;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}

	