package ru.cft.potatoservice.core.repositories.implementation;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.cft.potatoservice.core.repositories.UserRepository;
import ru.cft.potatoservice.model.User;

import java.util.List;

@NoArgsConstructor
@Repository
public class UserRepositoryImplementation implements UserRepository {

    private static final List<User> USERS = List.of(
            User.builder().firstName("Ivan").lastName("Ivanov").build(),
            User.builder().firstName("Petr").lastName("Petrov").build()
    );

    @Override
    public List<User> get() {
        return USERS;
    }
}
