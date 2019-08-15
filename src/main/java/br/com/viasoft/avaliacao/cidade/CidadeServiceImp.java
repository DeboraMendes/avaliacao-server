package br.com.viasoft.avaliacao.cidade;

import br.com.viasoft.avaliacao.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CidadeServiceImp extends CrudServiceImpl<Cidade, Long> implements CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    @Override
    protected JpaRepository<Cidade, Long> getRepository() { return cidadeRepository; }
}
