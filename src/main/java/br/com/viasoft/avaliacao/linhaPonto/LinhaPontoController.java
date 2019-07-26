package br.com.viasoft.avaliacao.linhaPonto;

import br.com.viasoft.avaliacao.crud.CrudController;
import br.com.viasoft.avaliacao.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/linhaponto")
public class LinhaPontoController extends CrudController<LinhaPonto, Long> {

    @Autowired
    private LinhaPontoService linhaPontoService;

    @Valid
    @Override
    protected CrudService<LinhaPonto, Long> getService() {
        return linhaPontoService;
    }

}
