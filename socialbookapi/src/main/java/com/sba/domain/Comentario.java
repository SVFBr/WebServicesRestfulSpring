package com.sba.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
public class Comentario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonInclude(Include.NON_NULL)
	private Long id;
	@JsonInclude(Include.NON_NULL)
	private String texto;
	@JsonInclude(Include.NON_NULL)
	private String usuario;
	@JsonInclude(Include.NON_NULL)
	private Date data;
//	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinColumn(name = "LIVRO_ID")
//	@JsonInclude(Include.NON_NULL)
//	private Livro livro;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

//	public Livro getLivro() {
//		return livro;
//	}
//
//	public void setLivro(Livro livro) {
//		this.livro = livro;
//	}

	
}
