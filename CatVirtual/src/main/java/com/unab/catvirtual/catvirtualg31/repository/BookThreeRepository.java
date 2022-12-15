package com.unab.catvirtual.catvirtualg31.repository;

import com.unab.catvirtual.catvirtualg31.entity.BookThree;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface BookThreeRepository extends MongoRepository<BookThree,String> {
    @Query(value = "{title: {$regex : /^?0/i}}", sort="{title:1}")
    public List<BookThree> findByLetter(String letter);

    @Query(value = "{price : { $gte: ?0 , $lte: ?1}}", sort= "{price: -1}")
    public List<BookThree> findBookRange(long priceMin, long priceMax);
}
