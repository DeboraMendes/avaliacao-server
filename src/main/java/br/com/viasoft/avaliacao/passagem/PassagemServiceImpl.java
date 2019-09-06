package br.com.viasoft.avaliacao.passagem;

import br.com.viasoft.avaliacao.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;

@Service
public class PassagemServiceImpl extends CrudServiceImpl<Passagem, Long> implements PassagemService {

    @Autowired
    private PassagemRepository passagemRepository;

    @Override
    protected JpaRepository<Passagem, Long> getRepository() { return passagemRepository; }

    @Override
    public  List<Passagem> searchPassagem(@NotNull String diaDaSemana, @NotNull Long origem, @NotNull Long destino) {
        return passagemRepository.findByDiasDaSemanaDescricaoAndOrigemIdAndDestinoId(diaDaSemana, origem, destino);
    }
}
