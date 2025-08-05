package com.pedrosantos.workshopmongodb.services;

import com.pedrosantos.workshopmongodb.domain.Post;
import com.pedrosantos.workshopmongodb.repository.PostRepository;
import com.pedrosantos.workshopmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }
}
