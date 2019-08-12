package br.com.viasoft.avaliacao.linhaPonto;

import br.com.viasoft.avaliacao.linha.Linha;
import br.com.viasoft.avaliacao.ponto.Ponto;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "linha_ponto")
@Data
public class LinhaPonto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_LINHA", referencedColumnName = "ID")
    @NotNull
    private Linha linha;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_PONTO", referencedColumnName = "ID")
    @NotNull
    private Ponto ponto;

//    @Column(nullable = true)
//    private LocalTime horario;
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
