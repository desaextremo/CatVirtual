package com.unab.catvirtual.catvirtualg31.controller;


import com.unab.catvirtual.catvirtualg31.entity.Author;
import com.unab.catvirtual.catvirtualg31.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping("/all")
    public List<Author> listAuthor()
    {
        return authorService.listAuthors();
    }

    @GetMapping("/{id}")
    public Author findById(@PathVariable("id") String id){
        return authorService.findById(id);
    }

    @PostMapping("/new")
    public Author addAuthor(@RequestBody Author author){
        return authorService.addAuthor(author);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable("id") String id){
        authorService.deleteAuthor(id);
    }

    @PutMapping("/save")
    public Author saveAuthor(@RequestBody Author author){
        return authorService.saveAuthor(author);
    }
}
