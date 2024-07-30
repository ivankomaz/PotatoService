package ru.cft.potatoservice.core.repositories.implementation;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.cft.potatoservice.core.repositories.UserRepository;
import ru.cft.potatoservice.model.User;
import ru.cft.potatoservice.model.mapper.UserMapper;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@Repository
public class UserRepositoryImplementation implements UserRepository {

    @Autowired
    private JdbcTemplate jdbsTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    private List<User> USERS = List.of(
            User.builder().uuid(1).firstName("Ivan").lastName("Ivanov").build(),
            User.builder().uuid(2).firstName("Petr").lastName("Petrov").build()
    );

    @Override
    public List<User> get(int id) {
        return jdbsTemplate.query("select * from test_table", new UserMapper());

        //return id <= 0 ? USERS : USERS.stream().filter(user -> user.getUuid() == id).collect(Collectors.toList());
    }

    @Override
    public void addUser(User user) {
        System.out.println("Adding user " + user.toString());
    }
}
