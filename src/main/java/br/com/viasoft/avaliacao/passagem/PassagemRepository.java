package br.com.viasoft.avaliacao.passagem;

import br.com.viasoft.avaliacao.cidade.Cidade;
import br.com.viasoft.avaliacao.diasDaSemana.DiaDaSemana;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface PassagemRepository extends JpaRepository<Passagem, Long> {

    List<Passagem> findByDiasDaSemanaDescricaoAndOrigemAndDestino(@NotNull String diaDaSemana, @NotNull Cidade origem, @NotNull Cidade destino);

}
