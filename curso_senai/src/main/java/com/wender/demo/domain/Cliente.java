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

@Entity // Avisa ao JPA que será uma tabela.
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

	// Constutor
	public Cliente() {
	}

	public Cliente(Integer idCliente, String nome, String cpfOuCnpj, String email, Set<String> telefones) {
		/* Atributo bustaa Class */
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.cpfOuCnpj = cpfOuCnpj;
		this.email = email;
		// Aqui não vai telefone

	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}

	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(Set<String> telefones) {
		this.telefones = telefones;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCliente == null) ? 0 : idCliente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (idCliente == null) {
			if (other.idCliente != null)
				return false;
		} else if (!idCliente.equals(other.idCliente))
			return false;
		return true;
	}

}
