package br.com.viasoft.avaliacao.tipoOnibus;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface TipoOnibusRepository extends JpaRepository<TipoOnibus, Long> {

    List<TipoOnibus> findByDescricaoContaining(@NotNull String descricao);
}
