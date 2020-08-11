package com.swan.book.domain;

import java.util.Optional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@DataMongoTest
public class StoreRepositoryTest {

    @Autowired
    StoreRepository storeRepository;


    @Test
    public void findByName() {
        Store store = new Store();
        store.setName("에이스서점");
        store.setCity("서울");

        storeRepository.save(store);

        Optional<Store> byId = storeRepository.findById(store.getId());
        assertThat(byId).isNotEmpty();

        Optional<Store> byName = storeRepository.findByName(store.getName());
        assertThat(byName).isNotEmpty();

        assertThat(byName.get().getName()).isEqualTo("에이스서점");
    }

}