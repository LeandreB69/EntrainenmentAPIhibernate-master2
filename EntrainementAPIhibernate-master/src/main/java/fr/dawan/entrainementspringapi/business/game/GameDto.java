package fr.dawan.entrainementspringapi.business.game;

import fr.dawan.entrainementspringapi.business.equipe.EquipeDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GameDto {
    private long id;
    private int version;
    private List <EquipeDto> equipes;

}
