package br.com.viasoft.avaliacao.tarifa;

import br.com.viasoft.avaliacao.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TarifaServiceImpl extends CrudServiceImpl<Tarifa, Long> implements TarifaService {

    @Autowired
    private TarifaRepository tarifaRepository;

    @Autowired
    private LogUpdateValorTarifaPassagem logUpdateValorTarifaPassagem;

    @Override
    protected JpaRepository<Tarifa, Long> getRepository() {
        return tarifaRepository;
    }

    @Override
    public Tarifa save(Tarifa entity) throws Exception {
        if (entity.getValor() <= 0) {
            throw new ValorMenorQueZeroException("O valor não pode ser menor que zero!");
        }
        return super.save(entity);
    }

    @Override
    public Integer updateValorTarifaPassagem(Long id, Double valor) throws ValorMenorQueZeroException {

        if (valor <= 0) {
            throw new ValorMenorQueZeroException("O valor não pode ser menor que zero!");
        }

        Integer update = tarifaRepository.updateValorTarifaPassagem(id, valor);

        logUpdateValorTarifaPassagem.save("O valor da Tarifa: " + id + " foi alterado para: " + valor);

        return update;
    }

    @Override
    public void delete(Tarifa entity) {
//        Tarifa outraTarifa = new Tarifa();
//        outraTarifa.setId(10L);
//        tarifaRepository.delete(outraTarifa); //aqui acontecerá a interceptação do teste
        tarifaRepository.delete(entity);
    }
}
