package fr.dawan.entrainementspringapi.business.game;

import fr.dawan.entrainementspringapi.business.equipe.Equipe;
import fr.dawan.entrainementspringapi.generic.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Game extends BaseEntity {


    @OneToMany(mappedBy = "game", orphanRemoval = true)
    private List<Equipe> equipes;


}
