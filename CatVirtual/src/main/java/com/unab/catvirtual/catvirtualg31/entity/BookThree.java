package com.unab.catvirtual.catvirtualg31.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "booksthree")
@Data
@Builder
public class BookThree {
    @Id
    private String isbn;
    @DBRef
    private Category category;
    private String title;
    @DBRef
    private Author author;
    private int pages;
    private long price;
    private int year;
    private boolean seleccionado;
    private String description;
}
