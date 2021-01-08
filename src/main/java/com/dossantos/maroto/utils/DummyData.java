package com.dossantos.maroto.utils;

import com.dossantos.maroto.model.Post;
import com.dossantos.maroto.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    BlogRepository blogRepository;

//    @PostConstruct
    public void savePosts() {

        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("Paulo Leonardo");
        post1.setData(LocalDate.now());
        post1.setTitulo("Primeiro Post");
        post1.setTexto("Este é meu primeiro Post, e deverá ser usado de forma simples... Você então me pergunta como?... e Cláro, eu respondo... com um texto totalmente nada a ver, dizendo o que eu devo ou não fazer nesse momento... Isto é... Se escrevo bastante ou pouco... se escrevo nada a ver, ou tudo a ver... Poist é... você acabou de ler um texto que não te levou a lugar nenhum!!!");

        Post post2 = new Post();
        post2.setAutor("Paulo Leonardo");
        post2.setData(LocalDate.now());
        post2.setTitulo("API-REST");
        post2.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

        postList.add(post1);
        postList.add(post2);

        for (Post post: postList){
            Post postSaved = blogRepository.save(post);
            System.out.println(postSaved);
        }
    }


}
