package gabriel.lima3.MesaFacil.core.usecases;

import gabriel.lima3.MesaFacil.core.entities.Evento;

public class criarEventoCaseImpl  implements criarEventoCase {


    @Override
    public Evento execute(Evento evento) {

        evento.nome();
        evento.descricao();
        evento.tipoEvento();
        evento.inicio();
        evento.fim();
        evento.mesa();
        evento.capacidade();

        if (evento.capacidade() == 0 || evento.capacidade() < 15 ) {
            System.out.println("Capacidade invalida");
        }else{
            evento.capacidade();
        }

        if (evento.mesa() != null) {

            System.out.println("Mesa ja ocupada");
        }else{
            evento.mesa();
        }

        return null;
    }




}
