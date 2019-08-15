package br.com.viasoft.avaliacao.empresa;

import br.com.viasoft.avaliacao.crud.CrudController;
import br.com.viasoft.avaliacao.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/empresa")
public class EmpresaController extends CrudController<Empresa, Long> {

    @Autowired
    private EmpresaService empresaService;

    @Valid
    @Override
    protected CrudService<Empresa, Long> getService() {
        return empresaService;
    }

}
