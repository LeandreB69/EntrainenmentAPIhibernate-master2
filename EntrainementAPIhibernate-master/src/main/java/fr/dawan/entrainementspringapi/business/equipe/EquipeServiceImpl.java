package fr.dawan.entrainementspringapi.business.equipe;

import fr.dawan.entrainementspringapi.business.user.UserDto;
import fr.dawan.entrainementspringapi.generic.AbstractGenericService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EquipeServiceImpl extends AbstractGenericService<Equipe, EquipeDto, IEquipeRepository, EquipeMapper> implements IEquipeService {
    public EquipeServiceImpl(IEquipeRepository repository, EquipeMapper mapper) {
        super(repository, mapper);
    }

}