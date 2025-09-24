package gabriel.lima3.MesaFacil.infrastructure.dto;

import gabriel.lima3.MesaFacil.core.entities.TipoEvento;

import java.time.LocalDate;


public record EventoDto(
        Long id,
        String nome,
        String descricao,
        TipoEvento tipoEvento,
        LocalDate inicio,
        LocalDate fim,
        Integer mesa,
        String identificador,
        Integer capacidade) {

}
