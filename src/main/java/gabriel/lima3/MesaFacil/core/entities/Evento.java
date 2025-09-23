package gabriel.lima3.MesaFacil.core.entities;

import java.time.LocalDate;

public record Evento(
        Long id,
        String nome,
        String descricao,
        //Enum
        TipoEvento tipoEvento,
        LocalDate inicio,
        LocalDate fim,
        String mesa,
        String identificador,
        Integer capacidade
) {








}
