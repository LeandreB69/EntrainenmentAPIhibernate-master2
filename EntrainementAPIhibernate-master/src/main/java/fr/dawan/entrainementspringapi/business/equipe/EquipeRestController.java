package fr.dawan.entrainementspringapi.business.equipe;


import fr.dawan.entrainementspringapi.generic.AbstractGenericRestController;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/equipe")
public class EquipeRestController extends AbstractGenericRestController<EquipeDto, IEquipeService> {
    public EquipeRestController(IEquipeService service) {
        super(service);
    }


}
