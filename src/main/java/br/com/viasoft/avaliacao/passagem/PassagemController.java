package br.com.viasoft.avaliacao.passagem;

import br.com.viasoft.avaliacao.crud.CrudController;
import br.com.viasoft.avaliacao.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/cidade")
public class PassagemController extends CrudController<Passagem, Long> {

    @Autowired
    private PassagemService passagemService;

    @Valid
    @Override
    protected CrudService<Passagem, Long> getService() {
        return passagemService;
    }

}
