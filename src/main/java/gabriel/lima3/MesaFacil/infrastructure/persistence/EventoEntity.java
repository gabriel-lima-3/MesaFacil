package gabriel.lima3.MesaFacil.infrastructure.persistence;

import gabriel.lima3.MesaFacil.core.entities.TipoEvento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name ="Eventos")

@AllArgsConstructor
@NoArgsConstructor
@Data

public class EventoEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nome;
    private String descricao;
    private TipoEvento tipoEvento;

    private LocalDate inicio;
    private LocalDate fim;

    private String mesa;
    private String identificador;
    private Integer capacidade;

}
