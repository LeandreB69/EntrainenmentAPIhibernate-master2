package fr.dawan.entrainementspringapi.business.game;

import fr.dawan.entrainementspringapi.business.equipe.EquipeMapper;
import fr.dawan.entrainementspringapi.generic.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {EquipeMapper.class})
public interface GameMapper extends GenericMapper<GameDto, Game> {

}
