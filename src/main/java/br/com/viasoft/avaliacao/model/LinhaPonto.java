package br.com.viasoft.avaliacao.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "linhaPonto")
@Data
public class LinhaPonto implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final String findAll = "LinhaPonto.findAll";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idLinha", referencedColumnName = "id")
    private Linha linha;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idPonto", referencedColumnName = "id")
    private Ponto ponto;

//    @Column(nullable = true)
//    private LocalTime horario;

    public LinhaPonto() {
        super();
    }

//    public LinhaPonto(Linha linha, Ponto ponto, LocalTime horario) {
//        super();
//        this.linha = linha;
//        this.ponto = ponto;
//        this.horario = horario;
//
//    }
    
    public LinhaPonto(Linha linha, Ponto ponto) {
        super();
        this.linha = linha;
        this.ponto = ponto;
        
    }
//
//    public LocalTime getLocalTimeHorario(String horario) {
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
//        try {
//            return LocalTime.parse(horario);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return LocalTime.parse(LocalTime.now().format(dtf));
//        }
//    }
}
