package com.sba.service.exceptions;

public class LivroNaoHaLivrosASeremListadosException extends RuntimeException {

	private static final long serialVersionUID = 1221543086126412930L;

	public LivroNaoHaLivrosASeremListadosException(String mensagem) {
		super(mensagem);
	}

	public LivroNaoHaLivrosASeremListadosException(String message, Throwable cause) {
		super(message, cause);
	}

	public LivroNaoHaLivrosASeremListadosException() {
		// TODO Auto-generated constructor stub
	}

}
