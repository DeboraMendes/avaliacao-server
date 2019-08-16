package br.com.viasoft.avaliacao.horariosETarifas.passagem;

import br.com.viasoft.avaliacao.crud.CrudController;
import br.com.viasoft.avaliacao.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/horariosetarifas")
public class HorariosETarifasController extends CrudController<HorariosETarifas, Long> {

    @Autowired
    private HorariosETarifasService passagemService;

    @Valid
    @Override
    protected CrudService<HorariosETarifas, Long> getService() {
        return passagemService;
    }

}
