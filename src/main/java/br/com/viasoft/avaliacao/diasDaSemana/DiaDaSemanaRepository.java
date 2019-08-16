package br.com.viasoft.avaliacao.diasDaSemana;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface DiaDaSemanaRepository extends JpaRepository<DiaDaSemana, Long> {

    List<DiaDaSemana> findByDescricaoContaining(@NotNull String descricao);
}
