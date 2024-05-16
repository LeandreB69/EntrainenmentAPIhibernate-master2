package fr.dawan.entrainementspringapi.business.user;

import fr.dawan.entrainementspringapi.generic.GenericMapper;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper extends GenericMapper<UserDto, User> {
}
