package com.example.clientservice.connector;


import com.example.clientservice.config.FeignConfig;
import com.example.clientservice.model.Book;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.List;

@FeignClient(
        name = "book-service",
        url = "${book-service.url}",
        configuration = FeignConfig.class,
        fallback = Fallback.class
)
public interface BookServiceConnector {
    @GetMapping("/api/books")
    List<Book> getAllBooks();
}


@Component
class Fallback implements BookServiceConnector {
    @Override
    public List<Book> getAllBooks() {
        System.out.println("Fallback works");
        return Collections.emptyList();
    }
}


