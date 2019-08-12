package br.com.viasoft.avaliacao.configuration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

//a anotação SpringBootApplication define que esta é uma classe de configuraçã do Spring Boot
@Configuration
public class DataSourceConfig {

    //a anotação @Bean define que o método seja gerenciado pelo Spring
    //este método é responsável por criar/retornar o DataSource de conexão ao banco de dados
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/AVALIACAO");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }
}
