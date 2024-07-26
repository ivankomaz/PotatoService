package ru.cft.potatoservice.core;

import ru.cft.potatoservice.model.User;

import java.util.List;

public interface UsersService {

    public List<User> get(int id);

    public void addUser(User user);
}
