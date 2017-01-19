package com.github.evgdim.survey.controller;

import com.github.evgdim.survey.domain.User;
import com.github.evgdim.survey.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Created by evgeni on 1/19/2017.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @GetMapping("/{id}")
    public Mono<User> find(@PathVariable Long id) {
        return this.userRepository.find(id);
    }
}
