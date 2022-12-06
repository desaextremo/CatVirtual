package com.unab.catvirtual.catvirtualg31.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bookstwo")
@Data
@Builder
public class BookTwo {
    @Id
    private String isbn;
    private Category category;
    private String title;
    private Author author;
    private int pages;
    private long price;
    private int year;
    private boolean seleccionado;
    private String description;
}
