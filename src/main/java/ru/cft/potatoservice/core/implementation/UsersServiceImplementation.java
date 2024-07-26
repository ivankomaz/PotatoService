package ru.cft.potatoservice.core.implementation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.cft.potatoservice.core.UsersService;
import ru.cft.potatoservice.core.repositories.UserRepository;
import ru.cft.potatoservice.model.User;

import java.util.List;

@AllArgsConstructor
@Service
public class UsersServiceImplementation implements UsersService {
    private final UserRepository repository;

    @Override
    public List<User> get(int id) {
        return repository.get(id);
    }

    @Override
    public void addUser(User user) {
        repository.addUser(user);
    }
}
