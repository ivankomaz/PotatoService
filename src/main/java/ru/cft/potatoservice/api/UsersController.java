package ru.cft.potatoservice.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.cft.potatoservice.core.UsersService;
import ru.cft.potatoservice.model.User;

import java.util.List;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UsersController {

    private final UsersService service;

    @GetMapping
    public List<User> get(){
        return service.get();
    }


}
