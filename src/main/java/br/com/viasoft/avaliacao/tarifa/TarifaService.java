package br.com.viasoft.avaliacao.tarifa;

import br.com.viasoft.avaliacao.crud.CrudService;

public interface TarifaService extends CrudService<Tarifa, Long> {

    Integer updateValorTarifaPassagem(Long id, Double valor) throws ValorMenorQueZeroException;
}
