package com.Wender.Senai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Wender.Senai.domain.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
	// Jpa fará todo o serviço de insert, delete, rename, update, etc.
	// Veja que busca o tipo do nosso id e integer
	// veja que é uma interface que extende os recursos do JPA
}