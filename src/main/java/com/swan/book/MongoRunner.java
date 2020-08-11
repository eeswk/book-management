package com.swan.book;

import com.swan.book.domain.Store;
import com.swan.book.domain.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class MongoRunner implements ApplicationRunner {

    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    StoreRepository storeRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Store store = new Store();
        store.setName("B서점");
        store.setCity("인천");

        //mongoTemplate.insert(store);
        storeRepository.insert(store);

        System.out.println("finished==>");
    }
}
