package com.Alimenta.Alimenta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Alimenta.Alimenta.model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {
	public List<Tema> findAllByPalavraChaveContainingIgnoreCase(String palavraChave);	
}