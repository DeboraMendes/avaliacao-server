package br.com.viasoft.avaliacao.resetarSenha;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ResetarSenhaRepository extends JpaRepository<ResetarSenhaToken, Long> {

	ResetarSenhaToken findByToken(String token);

	@Modifying(clearAutomatically = true)
    @Query("update Usuario p set p.senha = :senha where p.id = :id")
    void atualizarSenha(@Param("senha") String senha, @Param("id") Long id);
}
