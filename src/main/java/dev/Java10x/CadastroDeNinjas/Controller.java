package dev.Java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nessa rota!!!";
    }

}