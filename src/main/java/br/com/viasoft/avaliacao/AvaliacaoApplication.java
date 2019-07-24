package br.com.viasoft.avaliacao;

import br.com.viasoft.avaliacao.configuration.Configuration;
import org.springframework.boot.SpringApplication;

public class AvaliacaoApplication {

	public static void main(String[] args) {
		//A classe SpringApplication tem o método run que é responsável por rodar as configurações, ele possui dois parametros:
		//1º A classe onde está a configuração
		//2º  Argumentos do metodo main
		SpringApplication.run(Configuration.class, args);
	}
}