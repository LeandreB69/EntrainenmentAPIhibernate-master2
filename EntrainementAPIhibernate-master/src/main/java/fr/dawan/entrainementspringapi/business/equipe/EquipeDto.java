package fr.dawan.entrainementspringapi.business.equipe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EquipeDto {
    private long id;
    private int version;
    private long gameId;


}
