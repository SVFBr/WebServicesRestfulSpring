package com.sba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sba.domain.Comentario;

public interface ComentariosRepository extends JpaRepository<Comentario, Long> {

}
