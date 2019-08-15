package br.com.viasoft.avaliacao.empresa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

    Page<Empresa> findByNomeFantasiaLike(String nomeFantasia, Pageable pageable);

    long countByNomeFantasiaLike(String nomeFantasia);

    List<Empresa> findByNomeFantasiaContainingOrRazaoSocialContaining(@NotNull String nomeFantasia, @NotNull String razaoSocial);
}
