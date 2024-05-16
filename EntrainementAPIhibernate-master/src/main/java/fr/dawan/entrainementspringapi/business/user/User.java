package fr.dawan.entrainementspringapi.business.user;

import fr.dawan.entrainementspringapi.generic.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {
    private String pseudo;
    private String email;
    private int age;
    private String joueur;

}
