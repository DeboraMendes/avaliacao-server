package br.com.viasoft.avaliacao.linha;

import br.com.viasoft.avaliacao.crud.CrudController;
import br.com.viasoft.avaliacao.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/linha")
public class LinhaController extends CrudController<Linha, Long> {

    @Autowired
    private LinhaService linhaService;

    @Valid
    @Override
    protected CrudService<Linha, Long> getService() {
        return linhaService;
    }

}
