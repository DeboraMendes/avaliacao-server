package br.com.viasoft.avaliacao.cidade;

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
@RequestMapping("/cidade")
public class CidadeController extends CrudController<Cidade, Long> {

    @Autowired
    private CidadeService cidadeService;

    @Valid
    @Override
    protected CrudService<Cidade, Long> getService() {
        return cidadeService;
    }

    @GetMapping("complete")
    public List<Cidade> complete(@RequestParam("query") String query) {
        return cidadeService.complete(query);
    }

}
