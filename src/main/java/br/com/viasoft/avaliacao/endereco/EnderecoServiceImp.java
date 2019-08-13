package br.com.viasoft.avaliacao.endereco;

import br.com.viasoft.avaliacao.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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

}
