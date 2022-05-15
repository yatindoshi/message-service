package com.cgal.messageservice.client;

import com.cgal.messageservice.domain.Message;
import org.springframework.web.bind.annotation.GetMapping;
import reactivefeign.spring.config.ReactiveFeignClient;
import reactor.core.publisher.Flux;

@ReactiveFeignClient(name = "swift")
public interface SwiftClient {

    @GetMapping("messages")
    Flux<Message> getMessage();
}

