package com.github.evgdim.survey.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.function.Supplier;

/**
 * Created by evgeni on 1/19/2017.
 */
@RestController
@RequestMapping("/survey")
public class SurveyController {
    @GetMapping
    public Mono<String> index(){
        return Mono.just("asd");
    }
}
