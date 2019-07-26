package br.com.viasoft.avaliacao.linha;

import br.com.viasoft.avaliacao.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class LinhaServiceImp extends CrudServiceImpl<Linha, Long> implements LinhaService {

    @Autowired
    private LinhaRepository linhaRepository;

    @Override
    protected JpaRepository<Linha, Long> getRepository() {
        return linhaRepository;
    }

}
