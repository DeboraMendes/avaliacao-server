package br.com.viasoft.avaliacao.endereco;

import br.com.viasoft.avaliacao.crud.CrudService;

import java.util.List;

public interface EnderecoService extends CrudService<Endereco, Long> {

    List<Endereco> complete(String value);
}
