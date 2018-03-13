package com.sba.service.exceptions;

public class AutorExistenteException extends RuntimeException {

	private static final long serialVersionUID = 1221543086126412930L;

	public AutorExistenteException(String mensagem) {
		super(mensagem);
	}

	public AutorExistenteException(String message, Throwable cause) {
		super(message, cause);
	}

	public AutorExistenteException() {
		// TODO Auto-generated constructor stub
	}

}
