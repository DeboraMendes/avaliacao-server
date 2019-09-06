package br.com.viasoft.avaliacao.tarifa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface TarifaRepository extends JpaRepository<Tarifa, Long> {

    @Transactional
    @Modifying
    @Query("update Tarifa t " +
            "set t.valor = :valor " +
            "where t.id = :id ")
    Integer updateValorTarifaPassagem(@Param("id") Long id, @Param("valor") Double valor);

}
