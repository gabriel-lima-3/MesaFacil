package gabriel.lima3.MesaFacil.infrastructure.mapper;

import gabriel.lima3.MesaFacil.infrastructure.dto.EventoDto;
import gabriel.lima3.MesaFacil.infrastructure.persistence.EventoEntity;
import org.springframework.stereotype.Component;

@Component
public class EventoMapper {

    public EventoDto toEventoDto(EventoEntity evento) {

        return new EventoDto(
                evento.getId(),
                evento.getNome(),
                evento.getDescricao(),
                evento.getTipoEvento(),
                evento.getInicio(),
                evento.getFim(),
                evento.getMesa(),
                evento.getIdentificador(),
                evento.getCapacidade()
        );
    }

    public EventoEntity toEntity(EventoDto eventoDto) {
        EventoEntity entity = new EventoEntity();
        entity.setId(eventoDto.id());
        entity.setNome(eventoDto.nome());
        entity.setDescricao(eventoDto.descricao());
        entity.setTipoEvento(eventoDto.tipoEvento());
        entity.setInicio(eventoDto.inicio());
        entity.setFim(eventoDto.fim());
        entity.setMesa(eventoDto.mesa());
        entity.setIdentificador(eventoDto.identificador());
        entity.setCapacidade(eventoDto.capacidade());
        return entity;
    }



}
