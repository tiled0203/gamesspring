package be.smal.games.repositories;

import be.smal.games.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameJPARepository extends JpaRepository<Game, Long> {
}
