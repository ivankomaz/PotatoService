package ru.cft.potatoservice.api;

import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.cft.potatoservice.core.Parameters;
import ru.cft.potatoservice.core.UsersService;
import ru.cft.potatoservice.model.User;

import java.util.List;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UsersController {

    private final UsersService service;

    @GetMapping("/{id}")
    public List<User> get(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping("addUser")
    @ResponseBody
    public String addUser(@RequestBody User user){
        service.addUser(user);

        return user.toString() + "TEST Ok!";
    }
}
