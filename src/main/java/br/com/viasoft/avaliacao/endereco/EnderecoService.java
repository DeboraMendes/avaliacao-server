package br.com.viasoft.avaliacao.endereco;

import br.com.viasoft.avaliacao.crud.CrudService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EnderecoService extends CrudService<Endereco, Long> {

    Page<Endereco> findByRuaLikeOrBairroLike(String rua, String bairro, Pageable pageable);

    long countByRuaLikeOrBairroLike(String rua, String bairro);

    List<Endereco> complete(String value);
}
