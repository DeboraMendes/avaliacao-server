package br.com.viasoft.avaliacao.usuario;

import br.com.viasoft.avaliacao.crud.CrudController;
import br.com.viasoft.avaliacao.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/usuario")
public class UsuarioController extends CrudController<Usuario, Long> {

    @Autowired
    private UsuarioService usuarioService;

    @Valid
    @Override
    protected CrudService<Usuario, Long> getService() {
        return usuarioService;
    }

}
