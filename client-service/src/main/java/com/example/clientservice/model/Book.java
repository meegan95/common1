package com.example.clientservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@Document(collection = "books")
public class Book {

    private String id;
    private String title;
    private String description;
    private String imageLink;


}