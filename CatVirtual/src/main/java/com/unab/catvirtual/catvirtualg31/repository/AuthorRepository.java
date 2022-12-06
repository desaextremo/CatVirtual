package com.unab.catvirtual.catvirtualg31.repository;

import com.unab.catvirtual.catvirtualg31.entity.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AuthorRepository extends MongoRepository<Author,String> {
    //public Author findByFisrtName(String authorName);
}
