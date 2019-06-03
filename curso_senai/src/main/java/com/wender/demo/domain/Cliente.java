package com.wender.demo.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity//Avisa ao JPA que será uma tabela.
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id // Anotação avisando que esse atributo Será uma id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;
	// Atributos serão Campos na tabela
	private String nome;
	private String cpfOuCnpj;
	
	// O banco de dados não deixa repetir os dados
	@Column(unique = true)
	private String email;
	
	@ElementCollection // Cria uma tabela telefone
	@CollectionTable(name = "TELEFONE")
	private Set<String> telefones = new HashSet<>();	

}
