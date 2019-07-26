package br.com.viasoft.avaliacao.linhaPonto;

import br.com.viasoft.avaliacao.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class LinhaPontoServiceImp extends CrudServiceImpl<LinhaPonto, Long> implements LinhaPontoService {

    @Autowired
    private LinhaPontoRepository linhaPontoRepository;

    @Override
    protected JpaRepository<LinhaPonto, Long> getRepository() {
        return linhaPontoRepository;
    }

}