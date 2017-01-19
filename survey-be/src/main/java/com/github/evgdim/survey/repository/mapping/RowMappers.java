package com.github.evgdim.survey.repository.mapping;

import com.github.evgdim.survey.domain.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by evgeni on 1/19/2017.
 */
public final class RowMappers {
    public static final RowMapper<User> USER = new RowMapper<User>() {
        @Override
        public User mapRow(ResultSet rs, int i) throws SQLException {
            User user = new User();
            user.setId(rs.getLong("ID"));
            user.setName(rs.getString("NAME"));
            user.setEmail(rs.getString("EMAIL"));
            return user;
        }
    };
    private RowMappers() {
    }
}
