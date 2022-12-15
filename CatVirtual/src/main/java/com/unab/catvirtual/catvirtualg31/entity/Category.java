package com.unab.catvirtual.catvirtualg31.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "genders")
@Data
@Builder
public class Category {
    @Id
    private String id;
    @Indexed(unique = true)
    private String name;
}
