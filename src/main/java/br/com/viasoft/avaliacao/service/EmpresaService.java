package br.com.viasoft.avaliacao.service;

import br.com.viasoft.avaliacao.model.Empresa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmpresaService extends CrudService<Empresa, Long> {

    //aqui eu posso utilizar o Spring Data JPA na criacao de consultas. Por exemplo:
    Page<Empresa> findByNomeFantasiaLike(String nomeFantasia, Pageable pageable);

    long countByNomeFantasiaLike(String nomeFantasia);
}
