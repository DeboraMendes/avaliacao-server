package br.com.viasoft.avaliacao.estado;

import br.com.viasoft.avaliacao.crud.CrudController;
import br.com.viasoft.avaliacao.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/estado")
public class EstadoController extends CrudController<Estado, Long> {

    @Autowired
    private EstadoService estadoService;

    @Valid
    @Override
    protected CrudService<Estado, Long> getService() {
        return estadoService;
    }

}
