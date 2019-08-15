package br.com.viasoft.avaliacao.estado;

import br.com.viasoft.avaliacao.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class EstadoServiceImp extends CrudServiceImpl<Estado, Long> implements EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    protected JpaRepository<Estado, Long> getRepository() { return estadoRepository; }

}
