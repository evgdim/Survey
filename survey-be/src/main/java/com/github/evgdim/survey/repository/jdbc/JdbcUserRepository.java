package com.github.evgdim.survey.repository.jdbc;

import com.github.evgdim.survey.domain.User;
import com.github.evgdim.survey.repository.UserRepository;
import com.github.evgdim.survey.repository.mapping.RowMappers;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by evgeni on 1/19/2017.
 */
@Repository
public class JdbcUserRepository implements UserRepository {
    private final NamedParameterJdbcTemplate jdbcTemplate;

    public JdbcUserRepository(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Mono<User> find(Long userId) {
        Map<String, Object> params = new HashMap<>();
        params.put("userId", userId);
        List<User> users = this.jdbcTemplate.query("SELECT ID, NAME, EMAIL FROM USERS WHERE ID = :userId", params, RowMappers.USER);
        if(users.isEmpty()) {
            return Mono.empty();
        }
        return Mono.just(users.get(0));
    }

    @Override
    public Flux<User> findAll() {
        Map<String, Object> params = new HashMap<>();
        List<User> users = jdbcTemplate.query("SELECT ID, NAME, EMAIL FROM USERS", params, RowMappers.USER);
        return Flux.fromIterable(users);
    }
}
