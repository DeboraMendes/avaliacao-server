package br.com.viasoft.avaliacao.empresa;

import br.com.viasoft.avaliacao.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServiceImp extends CrudServiceImpl<Empresa, Long> implements EmpresaService {

    //injeção de dependencias
    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    protected JpaRepository<Empresa, Long> getRepository() {

        return empresaRepository;
    }

    @Override
    public Page<Empresa> findByNomeFantasiaLike(String nomeFantasia, Pageable pageable) {

        return empresaRepository.findByNomeFantasiaLike(nomeFantasia, pageable);
    }

    @Override
    public long countByNomeFantasiaLike(String nomeFantasia) {
        return empresaRepository.countByNomeFantasiaLike(nomeFantasia);
    }

}
