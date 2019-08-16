package br.com.viasoft.avaliacao.empresa;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

    List<Empresa> findByNomeContaining(@NotNull String nome);

}
