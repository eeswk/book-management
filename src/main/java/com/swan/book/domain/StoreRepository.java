package com.swan.book.domain;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StoreRepository extends MongoRepository<Store, String> {
    Optional<Store> findByName(String name);
}
