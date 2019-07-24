package br.com.viasoft.avaliacao.repository;

import br.com.viasoft.avaliacao.model.Empresa;
import org.springframework.data.repository.CrudRepository;

public interface EmpresaRepository extends CrudRepository<Empresa, Long> {

}
