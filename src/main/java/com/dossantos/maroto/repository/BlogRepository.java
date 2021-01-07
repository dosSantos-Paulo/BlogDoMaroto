package com.dossantos.maroto.repository;

import com.dossantos.maroto.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Post, Long> {
}
