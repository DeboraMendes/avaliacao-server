package br.com.viasoft.avaliacao.tarifa;

import br.com.viasoft.avaliacao.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TarifaServiceImp extends CrudServiceImpl<Tarifa, Long> implements TarifaService {

    @Autowired
    private TarifaRepository tarifaRepository;

    @Override
    protected JpaRepository<Tarifa, Long> getRepository() { return tarifaRepository; }
}
