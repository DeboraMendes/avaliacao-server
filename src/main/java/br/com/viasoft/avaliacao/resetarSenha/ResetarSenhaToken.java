package br.com.viasoft.avaliacao.resetarSenha;

import br.com.viasoft.avaliacao.usuario.Usuario;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
public class ResetarSenhaToken {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String token;

    @OneToOne(targetEntity = Usuario.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID")
    private Usuario usuario;

    @Column(nullable = false)
    private Date dataExpiracao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario pessoa) {
        this.usuario = usuario;
    }

    public Date getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(Date dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    public void setDataExpiracao(int minutos){
        Calendar agora = Calendar.getInstance();
        agora.add(Calendar.MINUTE, minutos);
        this.dataExpiracao = agora.getTime();
    }

    public boolean isExpired() {
        return new Date().after(this.dataExpiracao);
    }
}