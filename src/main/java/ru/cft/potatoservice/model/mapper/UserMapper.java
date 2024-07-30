package ru.cft.potatoservice.model.mapper;

import ru.cft.potatoservice.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User> {

    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        return User.builder().firstName(rs.getString("name")).uuid(rs.getInt("id")).build();
    }
}
