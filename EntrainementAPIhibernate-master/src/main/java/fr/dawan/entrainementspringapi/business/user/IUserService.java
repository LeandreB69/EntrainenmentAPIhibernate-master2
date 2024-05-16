package fr.dawan.entrainementspringapi.business.user;

import fr.dawan.entrainementspringapi.generic.IGenericService;

public interface IUserService extends IGenericService<UserDto> {
    UserDto findByEmail(String email);

    UserDto findByJoueur(String joueur);
}
