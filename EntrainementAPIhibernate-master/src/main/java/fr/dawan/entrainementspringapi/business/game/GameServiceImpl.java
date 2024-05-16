package fr.dawan.entrainementspringapi.business.game;

import fr.dawan.entrainementspringapi.generic.AbstractGenericService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class GameServiceImpl extends AbstractGenericService<Game, GameDto, IGameRepository, GameMapper> implements IGameService {
    public GameServiceImpl(IGameRepository repository, GameMapper mapper) {
        super(repository, mapper);
    }
}
