package com.unab.catvirtual.catvirtualg31.service;

import com.unab.catvirtual.catvirtualg31.entity.Author;
import com.unab.catvirtual.catvirtualg31.entity.BookThree;
import com.unab.catvirtual.catvirtualg31.entity.Category;
import com.unab.catvirtual.catvirtualg31.entity.dto.BookThreeDto;
import com.unab.catvirtual.catvirtualg31.repository.AuthorsRepository;
import com.unab.catvirtual.catvirtualg31.repository.BookThreeRepository;
import com.unab.catvirtual.catvirtualg31.repository.CategoryRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookThreeService {
    @Autowired
    private BookThreeRepository bookThreeRepository;
    @Autowired
    private AuthorsRepository authorsRepository;

    @Autowired
    private CategoryRepository categoryRepository;
    public List<BookThree> listBook(){
        return bookThreeRepository.findAll();
    }

    public BookThree queryBook(String isbn){
        BookThree BookThree;
        Optional<BookThree> optional =  bookThreeRepository.findById(isbn);

        if(!optional.isEmpty()){
            BookThree = optional.get();
        }else{
            BookThree = null;
        }
        return BookThree;
    }

    public BookThree addBook(BookThreeDto bookDto){
        BookThree bookThree = BookThree.builder().build();

        Optional<BookThree> optional =  bookThreeRepository.findById(bookDto.getIsbn());
        if(optional.isEmpty()) {
            Optional<Author> author = authorsRepository.findById(bookDto.getAuthorId());
            Optional<Category> category = categoryRepository.findById(bookDto.getCategoryId());
            //copia los datos del dto al libro
            BeanUtils.copyProperties(bookDto, bookThree);
            bookThree.setAuthor(author.get());
            bookThree.setCategory(category.get());

            return bookThreeRepository.insert(bookThree);
        }
        else return null;
    }

    /*
        Recibe un BookThreeDto, valida si en la base de datos existe un libro asociado al ISBN
        Si existe lo recupera (libroBD).

        Adicionalmente a partir del BookThreeDto valida si hay información del id de libro y de categorias
        de ser asi los obtiene de la base de datos mediante el método findById.

        Crea un BookThree vacio y pega los datos del BookThreeDto al objeto BookThree
        Si el BookThree contaba con informacion de autor y/o categorias los agrega al
     */
    public BookThree saveBook(BookThreeDto bookDto){
        BookThree bookThree = BookThree.builder().build();

        //1 Buscamos si el libro existe y recuperamos toda su información
        Optional<BookThree> optional =  bookThreeRepository.findById(bookDto.getIsbn());

        //el libro existe
        if (!optional.isEmpty()){
            BookThree libroBD = optional.get();
            //2 comparamos si los valores actuales son diferentes a los valores del libro recibido como parametro

            if (bookThree.getCategory()!=null) libroBD.setCategory(bookThree.getCategory());
            if (bookThree.getAuthor()!=null) libroBD.setAuthor(bookThree.getAuthor());
            if (bookThree.getDescription()!=null) libroBD.setDescription(bookThree.getDescription());
            if (bookThree.getTitle()!=null) libroBD.setTitle(bookThree.getTitle());
            if(bookThree.getPages()!=0) libroBD.setPages(bookThree.getPages());
            if(bookThree.getPrice()!=0) libroBD.setPrice(bookThree.getPrice());
            if(bookThree.getYear()!=0) libroBD.setYear(bookThree.getYear());
            if(bookThree.getDescription()!=null) libroBD.setDescription(bookThree.getDescription());

            return bookThreeRepository.save(libroBD);
        }else{ //el libro no existe
            return null;
        }
    }

    public void deleteBook(String id){
        bookThreeRepository.deleteById(id);
    }

    public List<BookThree> findBookRange(long priceMin, long priceMax){
        return bookThreeRepository.findBookRange(priceMin,priceMax);
    }

    public List<BookThree> findByLetter(String letter){
        return bookThreeRepository.findByLetter(letter);
    }
}
