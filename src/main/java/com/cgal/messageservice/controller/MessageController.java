package com.cgal.messageservice.controller;

import com.cgal.messageservice.client.SwiftClient;
import com.cgal.messageservice.domain.Message;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@AllArgsConstructor
public class MessageController {

    private final SwiftClient swiftClient;

    @GetMapping("messages")
    public Flux<Message> getMessages() {
        return swiftClient.getMessage();
    }

}
