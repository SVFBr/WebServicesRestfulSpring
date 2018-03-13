package com.sba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sba.domain.Autor;
import com.sba.repository.AutoresRepository;

@Service
public class AutoresService {

	@Autowired
	private AutoresRepository autoresRepository;

	// LISTAR
	public List<Autor> listar() {
		return autoresRepository.findAll();

	}

}
