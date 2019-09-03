package br.com.viasoft.avaliacao.passagem;

import br.com.viasoft.avaliacao.cidade.Cidade;
import br.com.viasoft.avaliacao.crud.CrudService;
import br.com.viasoft.avaliacao.diasDaSemana.DiaDaSemana;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface PassagemService extends CrudService<Passagem, Long> {

    List<Passagem> searchPassagem(@NotNull DiaDaSemana diaDaSemana, @NotNull Cidade origem, @NotNull Cidade destino);
}
