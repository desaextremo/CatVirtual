package com.unab.catvirtual.catvirtualg31.entity.dto;

import com.unab.catvirtual.catvirtualg31.entity.Author;
import com.unab.catvirtual.catvirtualg31.entity.Category;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Builder
public class BookThreeDto {
    private String isbn;
    private String categoryId;
    private String title;
    private String authorId;
    private int pages;
    private long price;
    private int year;
    private String description;
}
