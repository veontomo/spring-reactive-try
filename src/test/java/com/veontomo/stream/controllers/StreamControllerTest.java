package com.veontomo.stream.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.reactive.server.WebTestClient;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureWebTestClient
@WebAppConfiguration
public class StreamControllerTest {
    private WebTestClient webClient = WebTestClient
            .bindToServer()
            .baseUrl("http://localhost:8080")
            .build();

    @Test
    public void getStream() {
        this.webClient
                .get()
                .uri("/foos")
                .exchange()
                .expectStatus()
                .isOk();
    }
}