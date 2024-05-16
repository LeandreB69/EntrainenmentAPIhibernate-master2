package fr.dawan.entrainementspringapi.business.game;

import fr.dawan.entrainementspringapi.generic.AbstractGenericRestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/games")
public class GameRestController extends AbstractGenericRestController<GameDto, IGameService> {
    public GameRestController(IGameService service) {
        super(service);
    }
}
