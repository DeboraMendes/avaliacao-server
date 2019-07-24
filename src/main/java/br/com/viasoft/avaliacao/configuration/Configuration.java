package br.com.viasoft.avaliacao.configuration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

//a anotação SpringBootApplication define que esta é uma classe de configuraçã do Spring Boot
@SpringBootApplication
public class Configuration {

    //a anotação @Bean define que o método seja gerenciado pelo Spring
    //este método é responsável por criar o DataSource de conexão ao banco de dados
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/avaliacao");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }
}
