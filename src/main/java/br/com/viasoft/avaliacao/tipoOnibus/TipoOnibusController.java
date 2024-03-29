package br.com.viasoft.avaliacao.tipoOnibus;

import br.com.viasoft.avaliacao.crud.CrudController;
import br.com.viasoft.avaliacao.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

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

    @GetMapping("complete")
    public List<TipoOnibus> complete(@RequestParam("query") String query) {
        return tipoOnibusService.complete(query);
    }

}
