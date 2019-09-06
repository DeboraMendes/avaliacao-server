package br.com.viasoft.avaliacao.tipoOnibus;

import br.com.viasoft.avaliacao.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoOnibusServiceImpl extends CrudServiceImpl<TipoOnibus, Long> implements TipoOnibusService {

    @Autowired
    private TipoOnibusRepository tipoOnibusRepository;

    @Override
    protected JpaRepository<TipoOnibus, Long> getRepository() { return tipoOnibusRepository; }

    @Override
    public List<TipoOnibus> complete(String value) { return tipoOnibusRepository.findByDescricaoContaining(value); }
}
