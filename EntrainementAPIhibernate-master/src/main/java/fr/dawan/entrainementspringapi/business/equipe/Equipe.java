package fr.dawan.entrainementspringapi.business.equipe;

import fr.dawan.entrainementspringapi.business.game.Game;
import fr.dawan.entrainementspringapi.generic.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Equipe extends BaseEntity {

    @ManyToOne
    private Game game;



}
