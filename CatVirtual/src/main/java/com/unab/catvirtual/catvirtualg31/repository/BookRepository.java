package com.unab.catvirtual.catvirtualg31.repository;

import com.unab.catvirtual.catvirtualg31.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface BookRepository extends MongoRepository<Book,String> {
    public List<Book> findByCategory(String categoryName);

    public List<Book> findByAuthor(String authorName);

    public List<Book> findByTitleStartsWith(String letter);

    @Query(value="{ title: { $regex: /^?0/i }}",sort="{ title:1 }")
    public List<Book> findBookInitWithLetter(String letter);

    public List<Book> findByTitleEndingWith(String letter);

    @Query(value="{ title: { $regex: /?0$/i }}",sort="{ title:1 }")
    public List<Book> findBookEndWithLetter(String letter);

    public List<Book> findByTitleContains(String sequence);

    @Query(value="{ title: { $regex: /?0/i }}",sort="{ title:1 }")
    public List<Book> findBookContains(String sequence);

    @Query(value="{ price: { $gte:?0, $lte: ?1 }}",sort="{ price:1 }")
    public List<Book> listBooksByRange(long precioInferior, long precioSuperior );
}
