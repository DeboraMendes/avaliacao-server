package br.com.viasoft.avaliacao.tipoPonto;

import br.com.viasoft.avaliacao.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TipoPontoServiceImp extends CrudServiceImpl<TipoPonto, Long> implements TipoPontoService {

    @Autowired
    private TipoPontoRepository tipoPontoRepository;

    @Override
    protected JpaRepository<TipoPonto, Long> getRepository() {
        return tipoPontoRepository;
    }

}
