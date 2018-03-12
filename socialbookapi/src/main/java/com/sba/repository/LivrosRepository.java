package com.sba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sba.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long> {

}
