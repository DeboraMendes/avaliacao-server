package br.com.viasoft.avaliacao.ponto;

import br.com.viasoft.avaliacao.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PontoServiceImp extends CrudServiceImpl<Ponto, Long> implements PontoService {

    @Autowired
    private PontoRepository pontoRepository;

    @Override
    protected JpaRepository<Ponto, Long> getRepository() {
        return pontoRepository;
    }

}
