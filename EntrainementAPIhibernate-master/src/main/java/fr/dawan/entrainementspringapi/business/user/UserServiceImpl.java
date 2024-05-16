package fr.dawan.entrainementspringapi.business.user;

import fr.dawan.entrainementspringapi.generic.AbstractGenericService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServiceImpl extends AbstractGenericService<User, UserDto, IUserRepository, UserMapper> implements IUserService {
    public UserServiceImpl(IUserRepository repository, UserMapper mapper) {
        super(repository, mapper);
    }
    
    @Override
    public UserDto findByEmail(String email) {
        return mapper.toDto(repository.findByEmail(email));
    }

    @Override
    public UserDto findByJoueur(String joueur){
        return mapper.toDto(repository.findByJoueur(joueur));}
}
