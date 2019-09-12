package br.com.viasoft.avaliacao.passagem;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface PassagemRepository extends JpaRepository<Passagem, Long> {

    List<Passagem> findByDiasDaSemanaDescricaoAndOrigemIdAndDestinoId(@NotNull String diaDaSemana,
                                                                      @NotNull Long origem,
                                                                      @NotNull Long destino);

}
