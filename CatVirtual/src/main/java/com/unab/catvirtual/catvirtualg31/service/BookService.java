package com.unab.catvirtual.catvirtualg31.service;

import com.unab.catvirtual.catvirtualg31.entity.Book;
import com.unab.catvirtual.catvirtualg31.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> listBooks(){
        return bookRepository.findAll();
    }

    public Book findByIsbn(String isbn){
        Book book;
        Optional<Book> optional = bookRepository.findById(isbn);

        if (!optional.isEmpty())
            book = optional.get();
        else book=null;

        return book;
    }

    public Book addBook(Book book){

        Book oneBook;
        Optional<Book> optional = bookRepository.findById(book.getIsbn());

        if (!optional.isEmpty()) return null;
        else return bookRepository.insert(book);
    }

    public void deleteBook(String isbn){
        bookRepository.deleteById(isbn);
    }

    public Book saveBook(Book book){

        //1 Buscar el libro en base de datos cuyo id corresponde con el id del libro recibido como parametro
        Optional<Book> optional = bookRepository.findById(book.getIsbn());

        //existe
        if (!optional.isEmpty()){
            //obtner el libro de la db
            Book bookDb = optional.get();

            //pregunto si en el libro recibido como parametro viene información para cada atributo
            //de ser asi, actualizo el objeto actual con esa información
            if (book.getTitle()!=null) bookDb.setTitle(book.getTitle());
            if(book.getAuthor()!=null) bookDb.setAuthor(book.getAuthor());
            if(book.getCategory()!=null) bookDb.setCategory(book.getCategory());
            if(book.getPages()!=0) bookDb.setPages(book.getPages());
            if(book.getPrice()!=0) bookDb.setPrice(book.getPrice());
            if(book.getYear()!=0) bookDb.setYear(book.getYear());
            if(book.getDescription()!=null) bookDb.setDescription(book.getDescription());
            if(book.isSeleccionado()!=false) bookDb.setSeleccionado(book.isSeleccionado());

            return bookRepository.save(bookDb);
        }
        //no existe
        else return null;

    }

    public List<Book> listBooksByCategory(String categoryName){
        return bookRepository.findByCategory(categoryName);
    }

    public List<Book> listBooksByAuthor(String authorName){
        return bookRepository.findByAuthor(authorName);
    }

    public List<Book> listBooksByLetter(String letter){
        return bookRepository.findByTitleStartsWith(letter);
    }

    public List<Book> findBookInitWithLetter(String letter){
        return bookRepository.findBookInitWithLetter(letter);
    }

    public List<Book> findByTitleEndingWith(String letter){
        return bookRepository.findByTitleEndingWith(letter);
    }

    public List<Book> findBookEndWithLetter(String letter){
        return bookRepository.findBookEndWithLetter(letter);
    }


    public List<Book> findByTitleContains(String sequence){
        return bookRepository.findByTitleContains(sequence);
    }

    public List<Book> findBookContains(String sequence){
        return bookRepository.findBookContains(sequence);
    }

    public List<Book> listBooksByRange(long precioInferior, long precioSuperior){
        return bookRepository.listBooksByRange(precioInferior,precioSuperior);
    }
}
