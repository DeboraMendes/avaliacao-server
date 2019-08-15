package br.com.viasoft.avaliacao.empresa;

import br.com.viasoft.avaliacao.crud.CrudService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmpresaService extends CrudService<Empresa, Long> {

    //aqui eu posso utilizar o Spring Data JPA na criacao de consultas. Por exemplo:
    Page<Empresa> findByNomeFantasiaLike(String nomeFantasia, Pageable pageable);

    long countByNomeFantasiaLike(String nomeFantasia);

    List<Empresa> complete(String value);
}
