package com.swan.book.domain;

import javax.persistence.Id;
import jdk.jfr.DataAmount;
import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("account")
@Data
public class Account {
    @Id
    private String id;
    private String username;
    private String email;

}
