package dev.Java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nessa rota!!!";
    }

    // Add ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado!!!";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }
    // Procurar ninja por ID (READ)
    @GetMapping("/listarID")
    public String mostrarTodosOsNinjaPorID() {
        return "Mostrar ninja por ID!!!";
    }

    // Alterar dados dos ninja (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorID() {
        return "Alterar ninja por ID!!!";
    }

    // Deletar ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "Ninja deletador por ID";
    }

}