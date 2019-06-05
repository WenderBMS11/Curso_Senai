package com.wender.senai.domain.enuns;

public enum TipoCliente {
	// Será nosso estático
	PESSOAFISICA(1, "Pessoa Física"), PESSOAJURIDICA(2, "Pessoa Juridica");

	// Nossas atributos
	private int cod;
	private String descricao;

	// Construtor
	private TipoCliente(int cod, String descricaop) {
		this.cod = cod;
		this.descricao = descricao;
	}

	// gettes
	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;

	}

	public static TipoCliente toEnum(Integer cod) {

		if (cod == null) {
			return null;
		}
		for (TipoCliente x : TipoCliente.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}

		throw new IllegalArgumentException("id Inválido" + cod);
	}

}
