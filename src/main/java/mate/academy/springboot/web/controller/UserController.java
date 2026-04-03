package mate.academy.springboot.web.controller;

import java.util.List;
import mate.academy.springboot.web.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/index")
    public List<User> getUsers() {
        User user1 = new User(1L, "bob@i.ua");
        User user2 = new User(2L, "alice@i.ua");
        return List.of(user1, user2);
    }

}
