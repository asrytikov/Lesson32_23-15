package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final CommentRepository repository;

    @Autowired
    public UserService(CommentRepository repository) {
        this.repository = repository;
    }

    public CommentRepository getRepository() {
        return repository;
    }

}
