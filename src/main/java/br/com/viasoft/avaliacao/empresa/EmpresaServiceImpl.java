package br.com.viasoft.avaliacao.empresa;

import br.com.viasoft.avaliacao.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaServiceImpl extends CrudServiceImpl<Empresa, Long> implements EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    protected JpaRepository<Empresa, Long> getRepository() { return empresaRepository; }

    @Override
    public List<Empresa> complete(String value) { return empresaRepository.findByNomeContaining(value); }

}
