package fr.dawan.entrainementspringapi.business.user;

import fr.dawan.entrainementspringapi.generic.AbstractGenericRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/users")
public class UserRestController extends AbstractGenericRestController<UserDto, IUserService> {
    public UserRestController(IUserService service) {
        super(service);
    }
    
    @GetMapping("byEmail/{email}")
    public ResponseEntity<UserDto> findByEmail(@PathVariable String email) {
        return ResponseEntity.ok(service.findByEmail(email));
    }

    @GetMapping("byJoueur/{joueur}")
    public ResponseEntity<UserDto>findByJoueur(@PathVariable String joueur) {
        return ResponseEntity.ok(service.findByJoueur(joueur));
    }

}

