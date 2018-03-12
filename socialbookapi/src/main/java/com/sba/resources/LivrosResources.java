package com.sba.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sba.domain.Livro;
import com.sba.repository.LivrosRepository;

@RestController
@RequestMapping("/livros")
public class LivrosResources {

	@Autowired
	private LivrosRepository livrosRepository;

	/**
	 * 
	 * SALVAR
	 * 
	 */
	@RequestMapping(method = RequestMethod.POST)
	public void salvar(@RequestBody Livro livro) {
		livrosRepository.save(livro);
	}

	/**
	 * 
	 * LISTAR
	 * 
	 */
	@RequestMapping(method = RequestMethod.GET)
	public List<Livro> listar() {
		return livrosRepository.findAll();
	}

	/**
	 * 
	 * BUSCAR
	 * 
	 */

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Livro> listar(@PathVariable("id") Long id) {
		return livrosRepository.findById(id);
	}

	/**
	 * 
	 * ATUALIZAR
	 * 
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void atualizar(@PathVariable("id") Long id, @RequestBody Livro livro) {
		livro.setId(id);
		livrosRepository.save(livro);
	}

	/**
	 * 
	 * DELETAR
	 * 
	 */
 	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deletar(@PathVariable("id") Long id) {
		livrosRepository.deleteById(id);
	}

}
