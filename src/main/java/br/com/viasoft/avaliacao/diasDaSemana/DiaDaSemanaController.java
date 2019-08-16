package br.com.viasoft.avaliacao.diasDaSemana;

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
@RequestMapping("/diadasemana")
public class DiaDaSemanaController extends CrudController<DiaDaSemana, Long> {

    @Autowired
    private DiaDaSemanaService diaDaSemanaService;

    @Valid
    @Override
    protected CrudService<DiaDaSemana, Long> getService() {
        return diaDaSemanaService;
    }

    @GetMapping("complete")
    public List<DiaDaSemana> complete(@RequestParam("query") String query) {
        return diaDaSemanaService.complete(query);
    }

}
