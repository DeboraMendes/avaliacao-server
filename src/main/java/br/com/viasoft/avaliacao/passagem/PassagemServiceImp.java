package br.com.viasoft.avaliacao.passagem;

import br.com.viasoft.avaliacao.cidade.Cidade;
import br.com.viasoft.avaliacao.crud.CrudServiceImpl;
import br.com.viasoft.avaliacao.diasDaSemana.DiaDaSemana;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;

@Service
public class PassagemServiceImp extends CrudServiceImpl<Passagem, Long> implements PassagemService {

    @Autowired
    private PassagemRepository passagemRepository;

    @Override
    protected JpaRepository<Passagem, Long> getRepository() { return passagemRepository; }

    @Override
    public  List<Passagem> searchPassagem(@NotNull String diaDaSemana, @NotNull Cidade origem, @NotNull Cidade destino) {
        return passagemRepository.findByDiasDaSemanaDescricaoAndOrigemAndDestino(diaDaSemana, origem, destino);
    }
}
