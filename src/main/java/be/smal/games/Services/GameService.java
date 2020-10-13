package be.smal.games.Services;

import be.smal.games.domain.Game;
import be.smal.games.repositories.GameJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    GameJPARepository gameRepository;

    public Game findById(Long id) {
        Optional<Game> game = gameRepository.findById(id);
        if (game.isPresent()) return game.get();

        return null;

    }

    public List<Game> findAll() {
        return gameRepository.findAll();
    }
}
