package br.com.viasoft.avaliacao.tipoOnibus;

import br.com.viasoft.avaliacao.crud.CrudService;

import java.util.List;

public interface TipoOnibusService extends CrudService<TipoOnibus, Long> {

    List<TipoOnibus> complete(String value);
}
