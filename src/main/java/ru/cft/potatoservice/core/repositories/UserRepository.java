package ru.cft.potatoservice.core.repositories;

import ru.cft.potatoservice.model.User;

import java.util.List;

public interface UserRepository {

    public List<User> get();

}
