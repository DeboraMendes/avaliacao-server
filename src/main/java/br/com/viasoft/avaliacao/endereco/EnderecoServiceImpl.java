package br.com.viasoft.avaliacao.endereco;

import br.com.viasoft.avaliacao.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoServiceImpl extends CrudServiceImpl<Endereco, Long> implements EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    protected JpaRepository<Endereco, Long> getRepository() { return enderecoRepository; }

    @Override
    public List<Endereco> complete(String value) { return enderecoRepository.findByRuaContainingOrBairroContainingOrComplementoContaining(value, value, value); }
}
