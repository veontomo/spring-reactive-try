package com.veontomo.stream.controllers;

import com.veontomo.stream.models.Foo;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Controller
class StreamController {
    @GetMapping(path = "/foos", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<Foo> getStream() {
        return Flux.interval(Duration.ofSeconds(1)).map(i -> new Foo(i, "John " + i));
    }
}