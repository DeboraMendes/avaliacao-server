package br.com.viasoft.avaliacao.horariosETarifas.passagem;

import br.com.viasoft.avaliacao.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class HorariosETarifasServiceImp extends CrudServiceImpl<HorariosETarifas, Long> implements HorariosETarifasService {

    @Autowired
    private HorariosETarifasRepository horariosETarifasRepository;

    @Override
    protected JpaRepository<HorariosETarifas, Long> getRepository() {

        return horariosETarifasRepository;
    }
}
