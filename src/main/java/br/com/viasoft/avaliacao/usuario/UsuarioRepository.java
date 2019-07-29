package br.com.viasoft.avaliacao.usuario;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Page<Usuario> findByNomeLike(String nome, Pageable pageable);


    Usuario findByEmail(String email);

    long countByNomeLike(String nome);

    List<Usuario> findByEmailOrderById(String email);

    @Modifying(clearAutomatically = true)
    @Query("update Usuario p set p.senha = :senha where p.id = :id")
    void atualizarSenha(@Param("senha") String senha, @Param("id") Long id);

}
