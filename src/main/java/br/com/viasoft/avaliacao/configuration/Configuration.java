package br.com.viasoft.avaliacao.configuration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Classe de configuraçã do Spring Boot
@SpringBootApplication
@Controller
public class Configuration {

    //Anotações do spring mvc
    @RequestMapping("/")
    @ResponseBody
    String ola(){
        return "Olá, bem vindo ao meu projeto de avaliação :)";
    }
}
