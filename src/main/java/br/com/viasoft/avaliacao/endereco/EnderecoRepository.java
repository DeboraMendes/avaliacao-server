package br.com.viasoft.avaliacao.endereco;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

    List<Endereco> findByRuaContainingOrBairroContainingOrComplementoContaining(@NotNull String rua, @NotNull String bairro, @NotNull String complemento);

}
