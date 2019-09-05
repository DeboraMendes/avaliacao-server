package br.com.viasoft.avaliacao.passagem;

import br.com.viasoft.avaliacao.crud.CrudService;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface PassagemService extends CrudService<Passagem, Long> {

    List<Passagem> searchPassagem(@NotNull String diaDaSemana, @NotNull Long origem, @NotNull Long destino);

}
