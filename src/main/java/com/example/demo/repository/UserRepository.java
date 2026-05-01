package com.example.demo.repository;

import com.example.demo.Authorities;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {
        if ("admin".equals(user) && "1234567".equals(password)) {
            return List.of(Authorities.READ, Authorities.WRITE);
        }
        return Collections.emptyList();
    }
}