package gabriel.lima3.MesaFacil.core.entities;

import java.time.LocalDate;

public record Evento(
        Long id,
        String nome,
        String descricao,
        TipoEvento tipoEvento,
        LocalDate inicio,
        LocalDate fim,
        Integer mesa,
        String identificador,
        Integer capacidade
) {








}
