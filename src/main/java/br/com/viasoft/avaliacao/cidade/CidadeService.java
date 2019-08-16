package br.com.viasoft.avaliacao.cidade;

import br.com.viasoft.avaliacao.crud.CrudService;

import java.util.List;

public interface CidadeService extends CrudService<Cidade, Long> {

    List<Cidade> complete(String value);

}
