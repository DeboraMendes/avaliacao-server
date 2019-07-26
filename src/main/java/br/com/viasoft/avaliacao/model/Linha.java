package br.com.viasoft.avaliacao.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "linha")
@Data
public class Linha implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final String findAll = "Linha.findAll";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idEmpresa", referencedColumnName = "id")
    private Empresa empresa;

    @Column
    private String descricao;

    public Linha() {
        super();
    }

    public Linha(Empresa empresa, String descricao) {
        super();
        this.empresa = empresa;
        this.descricao = descricao;
    }

}








