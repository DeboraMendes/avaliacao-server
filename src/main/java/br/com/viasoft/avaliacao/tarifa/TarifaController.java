package br.com.viasoft.avaliacao.tarifa;

import br.com.viasoft.avaliacao.crud.CrudController;
import br.com.viasoft.avaliacao.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/tarifa")
public class TarifaController extends CrudController<Tarifa, Long> {

    @Autowired
    private TarifaService tarifaService;

    @Valid
    @Override
    protected CrudService<Tarifa, Long> getService() {
        return tarifaService;
    }
}
