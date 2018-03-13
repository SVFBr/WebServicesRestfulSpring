package com.sba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.sba.domain.Livro;
import com.sba.repository.LivrosRepository;
import com.sba.service.exceptions.LivroNaoEncontradoException;

@Service
public class LivrosService {

  @Autowired
  private LivrosRepository livrosRepository;
  
  
	// SALVAR
	public Livro salvar(Livro livro) {
		livro.setId(null);
		return livrosRepository.save(livro);
	}

	// LISTAR
	public List<Livro> listar() {
		return livrosRepository.findAll();
	}

	// BUSCAR
	public Livro buscar(Long id) {
		Livro livro = livrosRepository.findOne(id);
		if (livro == null) {
			throw new LivroNaoEncontradoException("Livro/código: " + id + " não pode ser encontrado");
		}
		return livro;
	}

	// ATUALIZAR
	public void atualizar(Livro livro) {
		verificarExistencia(livro);
		livrosRepository.save(livro);
	}

	// VERIFICAR EXISTENCIA
	private void verificarExistencia(Livro livro) {
		buscar(livro.getId());
	}

	// DELETAR
	public void deletar(Long id) {
		try {
			livrosRepository.delete(id);
		} catch (EmptyResultDataAccessException e) {
			throw new LivroNaoEncontradoException("Livro/código: " + id + " não pode ser encontrado para deleção");
		}
	}

}
