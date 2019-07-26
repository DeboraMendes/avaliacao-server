package br.com.viasoft.avaliacao.repository;

import br.com.viasoft.avaliacao.model.Empresa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

    Page<Empresa> findByNomeFantasiaLike(String nomeFantasia, Pageable pageable);

    long countByNomeFantasiaLike(String nomeFantasia);
}
