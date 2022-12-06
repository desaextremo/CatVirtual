package com.unab.catvirtual.catvirtualg31.repository;

import com.unab.catvirtual.catvirtualg31.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface BookRepository extends MongoRepository<Book,String> {
    public List<Book> findByCategory(String name);
    public List<Book> findByAuthor(String name);
    public List<Book> findByTitleContains(String title);
    public List<Book> findByTitleStartsWith(String letter);

    public List<Book> findByPages(int pages);

    @Query("{pages: ?0}")
    public List<Book> findByPagesAlterno(int pages);

    @Query(value="{price:{$gte:?0,$lte:?1}})",sort = "{price:1}")
    public List<Book> findByPriceBetween(long p1, long p2);
}
