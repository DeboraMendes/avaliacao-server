package br.com.viasoft.avaliacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/listaConvidados")
public class ListaConvidadosController {

    @GetMapping(value = "/")
    public @ResponseBody String listaConvidados() {
        return "listaConvidados";
    }
}
