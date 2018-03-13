package com.sba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sba.domain.Autor;
import com.sba.repository.AutoresRepository;
import com.sba.service.exceptions.AutorExistenteException;
import com.sba.service.exceptions.AutorNaoEncontradoException;

@Service
public class AutoresService {

	@Autowired
	private AutoresRepository autoresRepository;

	// LISTAR
	public List<Autor> listar() {
		return autoresRepository.findAll();
	}

	// SALVAR
	public Autor salvar(Autor autor) {
		if (autor.getId() != null) {
			Autor a = autoresRepository.findOne(autor.getId());
			if (a != null) {
				throw new AutorExistenteException();
			}
		}
		return autoresRepository.save(autor);
	}

	// BUSCAR
	public Autor buscar(Long id) {
		if (autoresRepository.findOne(id) == null) {
			throw new AutorNaoEncontradoException();
		}
		return autoresRepository.findOne(id);
	}
	
	

}
