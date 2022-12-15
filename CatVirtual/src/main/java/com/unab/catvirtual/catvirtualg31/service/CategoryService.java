package com.unab.catvirtual.catvirtualg31.service;

import com.unab.catvirtual.catvirtualg31.entity.Category;
import com.unab.catvirtual.catvirtualg31.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> listCategory(){
        return categoryRepository.findAll();
    }

    public Category findById(String id){
        Category Category;
        Optional<Category> optional = categoryRepository.findById(id);

        if (!optional.isEmpty())
            Category = optional.get();
        else Category=null;

        return Category;
    }

    public Category addCategory(Category category){
        try{
            return categoryRepository.insert(category);
        }catch (Exception e){
            return null;
        }

    }

    public void deleteCategory(String id){
        categoryRepository.deleteById(id);
    }

    public Category saveCategory(Category category){

        //1 Buscar la categoria en base de datos cuyo id corresponde con el id de la categoria recibida como parametro
        Optional<Category> optional = categoryRepository.findById(category.getId());

        //existe
        if (!optional.isEmpty()){
            //obtner la categoria de la db
            Category categoryDb = optional.get();

            //pregunto si en el libro recibido como parametro viene información para cada atributo
            //de ser asi, actualizo el objeto actual con esa información
            if (category.getName()!=null) categoryDb.setName(category.getName());
            return categoryRepository.save(categoryDb);
        }
        //no existe
        else return null;

    }
}
