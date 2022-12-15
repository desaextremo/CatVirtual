package com.unab.catvirtual.catvirtualg31.service;

import com.unab.catvirtual.catvirtualg31.entity.Author;
import com.unab.catvirtual.catvirtualg31.repository.AuthorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
    @Autowired
    private AuthorsRepository authorsRepository;

    public List<Author> listAuthors(){
        return authorsRepository.findAll();
    }

    public Author findById(String id){
        Author author;
        Optional<Author> optional = authorsRepository.findById(id);

        if (!optional.isEmpty())
            author = optional.get();
        else author=null;

        return author;
    }

    public Author addAuthor(Author author){
        try{
            return authorsRepository.insert(author);
        }catch (Exception e){
            return null;
        }
    }

    public void deleteAuthor(String id){
        authorsRepository.deleteById(id);
    }

    public Author saveAuthor(Author author){

        //1 Buscar el Author en base de datos cuyo id corresponde con el id del Author recibido como parametro
        Optional<Author> optional = authorsRepository.findById(author.getId());

        //existe
        if (!optional.isEmpty()){
            //obtener el Author de la db
            Author authorDb = optional.get();

            //pregunto si en el libro recibido como parametro viene información para cada atributo
            //de ser asi, actualizo el objeto actual con esa información
            if (author.getFisrtName()!=null) authorDb.setFisrtName(author.getFisrtName());
            if(author.getLastName()!=null) authorDb.setLastName(author.getLastName());
            if(author.getCountry()!=null) authorDb.setCountry(author.getCountry());
            if(author.getAbout()!=null) authorDb.setAbout(author.getAbout());
            if(author.getDateBorn()!=null) authorDb.setDateBorn(author.getDateBorn());

            return authorsRepository.save(authorDb);
        }
        //no existe
        else return null;

    }
}
