package fr.dawan.entrainementspringapi.business.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
    
    User findByEmail(String email);

    User findByJoueur(String joueur);
}
