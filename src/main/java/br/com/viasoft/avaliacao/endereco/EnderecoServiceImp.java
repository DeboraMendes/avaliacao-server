package br.com.viasoft.avaliacao.endereco;

import br.com.viasoft.avaliacao.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class EnderecoServiceImp extends CrudServiceImpl<Endereco, Long> implements EnderecoService {

    //injeção de dependencias
    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    protected JpaRepository<Endereco, Long> getRepository() {

        return enderecoRepository;
    }

    @Override
    public Page<Endereco> findByRuaLikeOrBairroLike(String rua, String bairro, Pageable pageable) {

        return enderecoRepository.findByRuaLikeOrBairroLike(rua, bairro, pageable);
    }

    @Override
    public long countByRuaLikeOrBairroLike(String rua, String bairro) {
        return enderecoRepository.countByRuaLikeOrBairroLike(rua, bairro);
    }
}
