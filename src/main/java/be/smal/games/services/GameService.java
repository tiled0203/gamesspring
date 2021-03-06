package be.smal.games.services;

import be.smal.games.domain.Game;
import be.smal.games.repositories.GameJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GameService {

    @Autowired
    GameJPARepository gameRepository;

    public Game findById(Integer id) {
        Optional<Game> game = gameRepository.findById(id);
        if (game.isPresent()) return game.get();

        return null;

    }

    public Iterable<Game> findAll() {
        return gameRepository.findAll();
    }
}
