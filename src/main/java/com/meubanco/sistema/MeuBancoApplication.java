package com.meubanco.sistema;

import com.meubanco.sistema.model.Cliente;
import com.meubanco.sistema.model.Conta;
import com.meubanco.sistema.model.ContaCorrente;
import com.meubanco.sistema.model.ContaPoupanca;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MeuBancoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MeuBancoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cliente alan = new Cliente();
		alan.setName("Alan");

		Conta cc = new ContaCorrente(alan);
		Conta poupanca = new ContaPoupanca(alan);

		cc.depositar(100);

		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
