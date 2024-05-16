package fr.dawan.entrainementspringapi.business.equipe;

import fr.dawan.entrainementspringapi.business.game.Game;
import fr.dawan.entrainementspringapi.business.game.GameDto;
import fr.dawan.entrainementspringapi.generic.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface EquipeMapper extends GenericMapper<EquipeDto, Equipe> {

    @Override
    @Mapping(source = "game.id", target="gameId")
    EquipeDto toDto(Equipe entity);
}
