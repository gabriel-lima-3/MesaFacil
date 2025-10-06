package gabriel.lima3.MesaFacil.infrastructure.mapper;
import gabriel.lima3.MesaFacil.core.entities.Evento;
import gabriel.lima3.MesaFacil.infrastructure.dto.EventoDto;
import gabriel.lima3.MesaFacil.infrastructure.persistence.EventoEntity;
import org.springframework.stereotype.Component;

@Component
public class EventoMapper {

    public EventoDto toEventoDto(Evento evento) {

        return new EventoDto(

                evento.id(),
                evento.nome(),
                evento.descricao(),
                evento.tipoEvento(),
                evento.inicio(),
                evento.fim(),
                evento.mesa(),
                evento.identificador(),
                evento.capacidade()
        );
    }

    public Evento toEntity (EventoDto eventoDto) {

        return new Evento(
                eventoDto.id(),
                eventoDto.nome(),
                eventoDto.descricao(),
                eventoDto.tipoEvento(),
                eventoDto.inicio(),
                eventoDto.fim(),
                eventoDto.mesa(),
                eventoDto.identificador(),
                eventoDto.capacidade()
        );

    }



}
