package br.com.viasoft.avaliacao.diasDaSemana;

import br.com.viasoft.avaliacao.crud.CrudService;

import java.util.List;

public interface DiaDaSemanaService extends CrudService<DiaDaSemana, Long> {

    List<DiaDaSemana> complete(String value);
}
