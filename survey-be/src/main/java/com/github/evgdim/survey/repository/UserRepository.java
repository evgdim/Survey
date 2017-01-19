package com.github.evgdim.survey.repository;

import com.github.evgdim.survey.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by evgeni on 1/19/2017.
 */
public interface UserRepository {
    public Mono<User> find(Long userId);
    public Flux<User> findAll();
}
