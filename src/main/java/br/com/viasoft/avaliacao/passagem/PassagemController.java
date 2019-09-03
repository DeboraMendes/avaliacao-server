package br.com.viasoft.avaliacao.passagem;

import br.com.viasoft.avaliacao.cidade.Cidade;
import br.com.viasoft.avaliacao.crud.CrudController;
import br.com.viasoft.avaliacao.crud.CrudService;
import br.com.viasoft.avaliacao.diasDaSemana.DiaDaSemana;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/passagem")
public class PassagemController extends CrudController<Passagem, Long> {

    @Autowired
    private PassagemService passagemService;

    @Valid
    @Override
    protected CrudService<Passagem, Long> getService() {
        return passagemService;
    }

    @GetMapping("searchPassagem")
    public List<Passagem> complete(@RequestParam("diaDaSemana") DiaDaSemana diaDaSemana,
                                   @RequestParam("origem") Cidade origem,
                                   @RequestParam("destino")Cidade destino) {
        return passagemService.searchPassagem(diaDaSemana, origem, destino);
    }

}
