package br.com.viasoft.avaliacao.historicoDoProcoDaPassagem;

import br.com.viasoft.avaliacao.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class HistoricoDoProcoDaPassagemServiceImp extends CrudServiceImpl<HistoricoDoProcoDaPassagem, Long> implements HistoricoDoProcoDaPassagemService {

    @Autowired
    private HistoricoDoProcoDaPassagemRepository historicoDoProcoDaPassagemRepository;

    @Override
    protected JpaRepository<HistoricoDoProcoDaPassagem, Long> getRepository() {
        return historicoDoProcoDaPassagemRepository;
    }
}
