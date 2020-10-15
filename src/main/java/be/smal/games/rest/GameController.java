package be.smal.games.rest;


import be.smal.games.Services.GameService;
import be.smal.games.domain.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping()
    public Iterable<Game> getGames(Principal principal){
        //messing with security
        System.out.println(principal.getName());
        return gameService.findAll();
    }

    @GetMapping("/{id}")
    public Game getGame(@PathVariable Integer id){
        return gameService.findById(id);
    }
}
