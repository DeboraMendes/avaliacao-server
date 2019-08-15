package br.com.viasoft.avaliacao.passagem;

import br.com.viasoft.avaliacao.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PassagemServiceImp extends CrudServiceImpl<Passagem, Long> implements PassagemService {

    @Autowired
    private PassagemRepository passagemRepository;

    @Override
    protected JpaRepository<Passagem, Long> getRepository() { return passagemRepository; }
}
