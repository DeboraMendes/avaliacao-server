package br.com.viasoft.avaliacao.cidade;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

    List<Cidade> findByNomeContaining(@NotNull String nome);

}
