package com.unab.catvirtual.catvirtualg31.repository;

import com.unab.catvirtual.catvirtualg31.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
