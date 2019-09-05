package br.com.viasoft.avaliacao.passagem;

import br.com.viasoft.avaliacao.crud.CrudController;
import br.com.viasoft.avaliacao.crud.CrudService;
import br.com.viasoft.avaliacao.tarifa.TarifaRepository;
import br.com.viasoft.avaliacao.tarifa.TarifaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/passagem")
public class PassagemController extends CrudController<Passagem, Long> {

    @Autowired
    private PassagemService passagemService;

    @Autowired
    private TarifaService tarifaService;

    @Valid
    @Override
    protected CrudService<Passagem, Long> getService() {
        return passagemService;
    }

    @GetMapping("searchPassagem")
    public List<Passagem> searchPassagem(@RequestParam("diaDaSemana") String diaDaSemana,
                                   @RequestParam("origem") Long origem,
                                   @RequestParam("destino")Long destino) {
        return passagemService.searchPassagem(diaDaSemana, origem, destino);
    }

    @PutMapping("{id}")
    void updateValorTarifaPassagem(@PathVariable Long id, @RequestParam("valor")  Double valor) {
        tarifaService.updateValorTarifaPassagem(id,valor);
    }
}
