package br.com.viasoft.avaliacao.tipoPonto;

import br.com.viasoft.avaliacao.crud.CrudController;
import br.com.viasoft.avaliacao.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/tipoponto")
public class TipoPontoController extends CrudController<TipoPonto, Long> {

    @Autowired
    private TipoPontoService tipoPontoService;

    @Valid
    @Override
    protected CrudService<TipoPonto, Long> getService() {
        return tipoPontoService;
    }

}
