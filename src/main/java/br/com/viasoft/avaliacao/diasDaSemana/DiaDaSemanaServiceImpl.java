package br.com.viasoft.avaliacao.diasDaSemana;

import br.com.viasoft.avaliacao.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiaDaSemanaServiceImpl extends CrudServiceImpl<DiaDaSemana, Long> implements DiaDaSemanaService {

    @Autowired
    private DiaDaSemanaRepository diaDaSemanaRepository;

    @Override
    protected JpaRepository<DiaDaSemana, Long> getRepository() { return diaDaSemanaRepository; }

    @Override
    public List<DiaDaSemana> complete(String value) { return diaDaSemanaRepository.findByDescricaoContaining(value); }
}
