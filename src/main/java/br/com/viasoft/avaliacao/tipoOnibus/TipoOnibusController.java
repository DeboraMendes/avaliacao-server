package br.com.viasoft.avaliacao.tipoOnibus;

import br.com.viasoft.avaliacao.crud.CrudController;
import br.com.viasoft.avaliacao.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/tipoonibus")
public class TipoOnibusController extends CrudController<TipoOnibus, Long> {

    @Autowired
    private TipoOnibusService tipoOnibusService;

    @Valid
    @Override
    protected CrudService<TipoOnibus, Long> getService() {
        return tipoOnibusService;
    }

}
