package br.com.viasoft.avaliacao.endereco;

import br.com.viasoft.avaliacao.crud.CrudController;
import br.com.viasoft.avaliacao.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/endereco")
public class EnderecoController extends CrudController<Endereco, Long> {

    @Autowired
    private EnderecoService enderecoService;

    @Valid
    @Override
    protected CrudService<Endereco, Long> getService() {
        return enderecoService;
    }

}
