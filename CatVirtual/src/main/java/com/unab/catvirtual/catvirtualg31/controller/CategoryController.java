package com.unab.catvirtual.catvirtualg31.controller;


import com.unab.catvirtual.catvirtualg31.entity.Category;
import com.unab.catvirtual.catvirtualg31.repository.CategoryRepository;
import com.unab.catvirtual.catvirtualg31.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all")
    public List<Category> listCategory()
    {
        return categoryService.listCategory();
    }

    @GetMapping("/{id}")
    public Category findById(@PathVariable("id") String id){
        return categoryService.findById(id);
    }

    @PostMapping("/new")
    public Category addCategory(@RequestBody Category category){
        return categoryService.addCategory(category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable("id") String id){
        categoryService.deleteCategory(id);
    }

    @PutMapping("/save")
    public Category saveCategory(@RequestBody Category category){
        return categoryService.saveCategory(category);
    }
}
