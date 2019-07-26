package br.com.viasoft.avaliacao.empresa;

import br.com.viasoft.avaliacao.crud.CrudController;
import br.com.viasoft.avaliacao.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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

    @GetMapping("/teste")
    public @ResponseBody String teste() {
        System.out.println("teste executado");
        return "deu sucesso! =D";
    }

    @GetMapping("filter/nomeFantasia")
    public Page<Empresa> findByNomeFantasiaLike(
            @RequestParam String filter,
            @RequestParam int page,
            @RequestParam int size,
            @RequestParam(required = false) String order,
            @RequestParam(required = false) Boolean asc) {
        PageRequest pageRequest = PageRequest.of(page, size);
        if (order != null && asc != null) {
            PageRequest.of(page, size, asc ? Sort.Direction.ASC : Sort.Direction.DESC, order);
        }
        return empresaService.findByNomeFantasiaLike("%" + filter + "%", pageRequest);
    }

    @GetMapping("search/count")
    public long findByNomeFantasiaLike(@RequestParam String filter) {
        return empresaService.countByNomeFantasiaLike("%" + filter + "%");
    }

}