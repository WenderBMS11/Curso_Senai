package com.Wender.Senai;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Wender.Senai.domain.Cliente;
import com.Wender.Senai.domain.Estado;
import com.Wender.Senai.domain.enuns.TipoCliente;
import com.Wender.Senai.repositories.ClienteRepository;
import com.Wender.Senai.repositories.EstadoRepository;

@SpringBootApplication
public class CursoSenaiApplication implements CommandLineRunner{
	
	//Uma dependencia para instanciar todo o objeto.
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursoSenaiApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		//Instacio estado e preencho
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");
		//Foi chamado acima e aqui salva.
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		
		Cliente cli1 = new Cliente(null, "Crispim Luiz", "12345678987", "c.luiz@fiemg.com.br",
				TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("34900000000", "98765432112"));
		clienteRepository.saveAll(Arrays.asList(cli1));
		
		Cliente cli2 = new Cliente(null, "Luiz", "35412698745", "luiz89@gmail.com.br",
				TipoCliente.PESSOAFISICA);
		cli2.getTelefones().addAll(Arrays.asList("56987458965", "23156985647"));
		clienteRepository.saveAll(Arrays.asList(cli2));
		
		Cliente cli3 = new Cliente(null, "Betina", "36521456328", "betina25@gmail.com.br",
				TipoCliente.PESSOAFISICA);
		cli3.getTelefones().addAll(Arrays.asList("88888888889", "77777777778"));
		clienteRepository.saveAll(Arrays.asList(cli3));
		
		Cliente cli4 = new Cliente(null, "Abel", "12345678987", "abel99@gmail.com.br",
				TipoCliente.PESSOAFISICA);
		cli4.getTelefones().addAll(Arrays.asList("55555555554", "66666666662"));
		clienteRepository.saveAll(Arrays.asList(cli4));
		
		Cliente cli5 = new Cliente(null, "Laura", "14785236547", "laura13@gmail.com.br",
				TipoCliente.PESSOAFISICA);
		cli5.getTelefones().addAll(Arrays.asList("11111111117", "54785555558"));
		clienteRepository.saveAll(Arrays.asList(cli5));
		
		Cliente cli6 = new Cliente(null, "Herigue", "58965478521", "herigue22@gmail.com.br",
				TipoCliente.PESSOAFISICA);
		cli6.getTelefones().addAll(Arrays.asList("66665555478", "44466699988"));
		clienteRepository.saveAll(Arrays.asList(cli6));
		
		Cliente cli7 = new Cliente(null, "Joao", "99977733311", "joao44@gmail.com.br",
				TipoCliente.PESSOAFISICA);
		cli7.getTelefones().addAll(Arrays.asList("33366655544", "55544448877"));
		clienteRepository.saveAll(Arrays.asList(cli7));
		
		Cliente cli8 = new Cliente(null, "Matheus", "77788844455", "matheus55@gmail.com.br",
				TipoCliente.PESSOAFISICA);
		cli8.getTelefones().addAll(Arrays.asList("22222255555", "77772222266"));
		clienteRepository.saveAll(Arrays.asList(cli8));
		
		Cliente cli9 = new Cliente(null, "Lemoel", "33355544488", "lemoel36@gmail.com.br",
				TipoCliente.PESSOAFISICA);
		cli9.getTelefones().addAll(Arrays.asList("66655544472", "33322255566"));
		clienteRepository.saveAll(Arrays.asList(cli9));
		
		Cliente cli10 = new Cliente(null, "Thiago", "85236974586", "thiago55@gmail.com.br",
				TipoCliente.PESSOAFISICA);
		cli10.getTelefones().addAll(Arrays.asList("95458822664", "44444455557"));
		clienteRepository.saveAll(Arrays.asList(cli10));
	}

}
