package br.com.viasoft.avaliacao;

import br.com.viasoft.avaliacao.configuration.DataSourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AvaliacaoApplication {

	public static void main(String[] args) {
		//A classe SpringApplication tem o método run que é responsável por rodar as configurações, ele possui dois parametros:
		//1º A classe onde está a configuração
		//2º  Argumentos do metodo main
		SpringApplication.run(AvaliacaoApplication.class, args);
	}
}