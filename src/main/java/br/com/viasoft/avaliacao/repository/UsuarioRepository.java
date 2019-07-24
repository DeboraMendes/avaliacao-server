package br.com.viasoft.avaliacao.repository;

import br.com.viasoft.avaliacao.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
