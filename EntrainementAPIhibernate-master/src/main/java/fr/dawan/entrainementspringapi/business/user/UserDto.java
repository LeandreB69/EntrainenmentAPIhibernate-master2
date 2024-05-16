package fr.dawan.entrainementspringapi.business.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private int id;
    private String pseudo;
    private String email;
    private int age;
    private String joueur;

}
