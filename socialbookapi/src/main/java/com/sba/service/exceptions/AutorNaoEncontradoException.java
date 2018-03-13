package com.sba.service.exceptions;

public class AutorNaoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = 1221543086126412930L;

	public AutorNaoEncontradoException(String mensagem) {
		super(mensagem);
	}

	public AutorNaoEncontradoException(String message, Throwable cause) {
		super(message, cause);
	}

	public AutorNaoEncontradoException() {
		// TODO Auto-generated constructor stub
	}

}
