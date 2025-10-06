package gabriel.lima3.MesaFacil.infrastructure.persistence;


import gabriel.lima3.MesaFacil.infrastructure.dto.EventoDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
public class EventoController {


    @PostMapping("criarevento")
    public String criarEvento(@RequestBody EventoDto eventodto) {

        return "";

    }

    @DeleteMapping("deletar")
    public String deleterEvento(){

        return "";

    }

    @GetMapping("listar")
    public String listar(){
        return "";
    }

    @GetMapping
    public String listarId(){
        return "";
    }

    @PutMapping
    public String editarEvento() {
        return "";
    }

}
