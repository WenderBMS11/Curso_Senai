package com.Wender.Senai;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Wender.Senai.domain.Cidade;
import com.Wender.Senai.domain.Cliente;
import com.Wender.Senai.domain.Endereco;
import com.Wender.Senai.domain.Estado;
import com.Wender.Senai.domain.enuns.TipoCliente;
import com.Wender.Senai.repositories.CidadeRepository;
import com.Wender.Senai.repositories.ClienteRepository;
import com.Wender.Senai.repositories.EnderecoRepository;
import com.Wender.Senai.repositories.EstadoRepository;

@SpringBootApplication
public class CursoSenaiApplication implements CommandLineRunner {

	// Uma dependencia para instanciar todo o objeto.
	@Autowired
	private EstadoRepository estadoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Autowired
	private CidadeRepository cidadeRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursoSenaiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Instacio estado e preencho
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");
		// Foi chamado acima e aqui salva.
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		
		Cidade c1 = new Cidade(null, "Uberlãndia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		cidadeRepository.saveAll(Arrays.asList(c1, c2));


		Cliente cli1 = new Cliente(null, "Crispim Luiz", "12345678987", "c.luiz@fiemg.com.br2",
				TipoCliente.PESSOAFISICA);

		Cliente cli2 = new Cliente(null, "Godo Fredo", "987654321", "teste@fiemg.com.br", TipoCliente.PESSOAFISICA);
		cli2.getTelefones().addAll(Arrays.asList("77777777777", "99999999999"));
	

		Cliente cli01 = new Cliente(null, "Crispim Luiz", "12345678987", "c.luiz@fiemg.com.br",
				TipoCliente.PESSOAFISICA);
		cli01.getTelefones().addAll(Arrays.asList("34900000000", "98765432112"));

		Cliente cli02 = new Cliente(null, "Luiz", "35412698745", "luiz89@gmail.com.br", TipoCliente.PESSOAFISICA);
		cli02.getTelefones().addAll(Arrays.asList("56987458965", "23156985647"));

		Cliente cli03 = new Cliente(null, "Betina", "36521456328", "betina25@gmail.com.br", TipoCliente.PESSOAFISICA);
		cli03.getTelefones().addAll(Arrays.asList("88888888889", "77777777778"));

		Cliente cli04 = new Cliente(null, "Abel", "12345678987", "abel99@gmail.com.br", TipoCliente.PESSOAFISICA);
		cli04.getTelefones().addAll(Arrays.asList("55555555554", "66666666662"));

		Cliente cli05 = new Cliente(null, "Laura", "14785236547", "laura13@gmail.com.br", TipoCliente.PESSOAFISICA);
		cli05.getTelefones().addAll(Arrays.asList("11111111117", "54785555558"));
	

		Cliente cli06 = new Cliente(null, "Herigue", "58965478521", "herigue22@gmail.com.br", TipoCliente.PESSOAFISICA);
		cli06.getTelefones().addAll(Arrays.asList("66665555478", "44466699988"));
		

		Cliente cli07 = new Cliente(null, "Joao", "99977733311", "joao44@gmail.com.br", TipoCliente.PESSOAFISICA);
		cli07.getTelefones().addAll(Arrays.asList("33366655544", "55544448877"));
	

		Cliente cli08 = new Cliente(null, "Matheus", "77788844455", "matheus55@gmail.com.br", TipoCliente.PESSOAFISICA);
		cli08.getTelefones().addAll(Arrays.asList("22222255555", "77772222266"));
		

		Cliente cli09 = new Cliente(null, "Lemoel", "33355544488", "lemoel36@gmail.com.br", TipoCliente.PESSOAFISICA);
		cli09.getTelefones().addAll(Arrays.asList("66655544472", "33322255566"));
		

		Cliente cli010 = new Cliente(null, "Thiago", "85236974586", "thiago55@gmail.com.br", TipoCliente.PESSOAFISICA);
		cli010.getTelefones().addAll(Arrays.asList("95458822664", "44444455557"));
		
		clienteRepository.saveAll(Arrays.asList(cli1, cli2, cli01, cli02, cli03, cli04, cli05, cli06, cli07, cli06, cli07, cli08, cli09, cli010));

		Endereco e1 = new Endereco(null, "Rua das Emboabas", "55b", "Ap 310", "Jardim", "38447587", cli01, c1);
		Endereco e2 = new Endereco(null, "Rua Alameda Nasciute", "234", null, "Centro", "34555098", cli02, c2);
		Endereco e3 = new Endereco(null, "Rua do cabare", "349", "610", "Campo", "64978123", cli03, c1);
		Endereco e4 = new Endereco(null, "Rua das Estrelas", "45c", "Ap l90", "Matos", "87956412", cli04, c2);
		Endereco e5 = new Endereco(null, "Rua dos Trovões", "89c", "576", "Ventos", "56486958", cli05, c1);
		Endereco e6 = new Endereco(null, "Rua das ", "50b", "Ap 310", "Jardim", "38447587", cli06, c2);
		Endereco e7 = new Endereco(null, "Rua das Olivéiras", "321", "310", "Jabuti", "56489848", cli07, c1);
		Endereco e8 = new Endereco(null, "Rua dos bichos", "69b", "200", "Galinhas", "56954412", cli08, c2);
		Endereco e9 = new Endereco(null, "Rua das Balas", "569", "Ap 369", "Dados", "56231489", cli09, c1);
		Endereco e10 = new Endereco(null, "Rua das Embalagens", "102", "874", "Água", "87452136", cli010, c1);

		cli01.getEnderecos().addAll(Arrays.asList(e1));
		cli02.getEnderecos().addAll(Arrays.asList(e2));
		cli03.getEnderecos().addAll(Arrays.asList(e3));
		cli04.getEnderecos().addAll(Arrays.asList(e4));
		cli05.getEnderecos().addAll(Arrays.asList(e5));
		cli06.getEnderecos().addAll(Arrays.asList(e6));
		cli07.getEnderecos().addAll(Arrays.asList(e7));
		cli08.getEnderecos().addAll(Arrays.asList(e8));
		cli09.getEnderecos().addAll(Arrays.asList(e9));
		cli010.getEnderecos().addAll(Arrays.asList(e10));
		enderecoRepository.saveAll(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10));
		

	
	}

}
