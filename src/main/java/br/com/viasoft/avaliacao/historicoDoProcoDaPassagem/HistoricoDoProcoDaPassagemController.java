package br.com.viasoft.avaliacao.historicoDoProcoDaPassagem;

import br.com.viasoft.avaliacao.crud.CrudController;
import br.com.viasoft.avaliacao.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/historicodoprocodapassagemservice")
public class HistoricoDoProcoDaPassagemController extends CrudController<HistoricoDoProcoDaPassagem, Long> {

    @Autowired
    private HistoricoDoProcoDaPassagemService historicoDoProcoDaPassagemService;

    @Valid
    @Override
    protected CrudService<HistoricoDoProcoDaPassagem, Long> getService() {
        return historicoDoProcoDaPassagemService;
    }

}
