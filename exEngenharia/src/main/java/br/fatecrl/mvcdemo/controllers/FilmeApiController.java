package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Filme;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/filmes")

public class FilmeApiController {
    private static final List<Filme> filmes = new ArrayList<Filme>();

    public FilmeApiController() {
        filmes.add(new Filme("Super Mario Bros", "https://sm.ign.com/ign_br/movie/s/super-mari/super-mario-bros-o-filme_hnx9.jpg"));
        filmes.add(new Filme("Guardiões da Galáxia Vol. 3", "https://images2.portalon.com.br/wp-content/uploads/2023/05/guardioes-da-galaxia-novo-trailer-1024x1536-1-1683049744.jpg"));
        filmes.add(new Filme("A Pequena Sereia", "https://maceioshopping.com/app/uploads/2023/05/A-Pequena-Sereia.jpg"));
        filmes.add(new Filme("Velozes e Furiosos 10", "https://www.cinesystem.com.br/filmes/images/poster/velozes-e-furiosos-10.jpg  "));

    }

    @GetMapping
    public List<Filme> getFilmes(){
        return filmes;
    }

}
