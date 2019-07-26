package br.com.viasoft.avaliacao.ponto;

import br.com.viasoft.avaliacao.crud.CrudController;
import br.com.viasoft.avaliacao.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/ponto")
public class PontoController extends CrudController<Ponto, Long> {

    @Autowired
    private PontoService pontoService;

    @Valid
    @Override
    protected CrudService<Ponto, Long> getService() {
        return pontoService;
    }

}
