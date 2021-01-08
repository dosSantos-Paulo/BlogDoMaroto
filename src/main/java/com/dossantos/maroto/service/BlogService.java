package com.dossantos.maroto.service;

import com.dossantos.maroto.model.Post;

import java.util.List;

public interface BlogService {

    List<Post> findAll();

    Post findById(long id);

    Post save(Post post);

}
