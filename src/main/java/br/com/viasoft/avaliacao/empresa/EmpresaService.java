package br.com.viasoft.avaliacao.empresa;

import br.com.viasoft.avaliacao.cidade.Cidade;
import br.com.viasoft.avaliacao.crud.CrudService;

import java.util.List;

public interface EmpresaService extends CrudService<Empresa, Long> {

    List<Empresa> complete(String value);
}
