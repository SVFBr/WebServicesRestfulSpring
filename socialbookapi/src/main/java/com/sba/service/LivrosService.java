package com.sba.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.sba.domain.Comentario;
import com.sba.domain.Livro;
import com.sba.repository.ComentariosRepository;
import com.sba.repository.LivrosRepository;
import com.sba.service.exceptions.LivroNaoEncontradoException;
import com.sba.service.exceptions.LivroNaoHaLivrosASeremListadosException;

@Service
public class LivrosService {

	@Autowired
	private LivrosRepository livrosRepository;

	@Autowired
	private ComentariosRepository comentariosRepository;

	// SALVAR
	public Livro salvar(Livro livro) {
		livro.setId(null);
		return livrosRepository.save(livro);
	}

	// SALVAR COMENTARIO
	
	public Comentario salvarComentario(Long livroId, Comentario comentario) {
		Livro livro = buscar(livroId);
		comentario.setLivro(livro);
		comentario.setData(new Date());
		return comentariosRepository.save(comentario);
	}
	//LISTAR COMENTARIOS
	public List<Comentario> listarComentario(Long livroId) {
		Livro livro = buscar(livroId);
		return livro.getComentarios();
	}

	// LISTAR
	public List<Livro> listar() {
		if (livrosRepository.findAll().isEmpty()) {
			throw new LivroNaoHaLivrosASeremListadosException();
		}
		return livrosRepository.findAll();
	}

	// BUSCAR
	public Livro buscar(Long id) {
		Livro livro = livrosRepository.findOne(id);
		if (livro == null) {
			throw new LivroNaoEncontradoException();
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
			throw new LivroNaoEncontradoException();
		}
	}

}
