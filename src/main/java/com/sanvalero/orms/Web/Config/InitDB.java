package com.sanvalero.orms.Web.Config;

import com.sanvalero.orms.Repositories.Entities.PostEntity;
import com.sanvalero.orms.Repositories.Entities.UserEntity;
import com.sanvalero.orms.Repositories.Interfaces.PostsRepository;
import com.sanvalero.orms.Repositories.Interfaces.UsersRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitDB {
    @Bean
    CommandLineRunner initDatabase(UsersRepository usersRepository, PostsRepository postsRepository){
        return args -> {
            usersRepository.save(new UserEntity("User 1", 1_000_000L));
            usersRepository.save(new UserEntity("User 2", 100_000L));
            usersRepository.save(new UserEntity("User 3", 10_000L));

            postsRepository.save(new PostEntity(1L, "Primer mensaje de prueba del usuario 1"));
            postsRepository.save(new PostEntity(1L, "Segundo mensaje de prueba del usuario 1"));
            postsRepository.save(new PostEntity(1L, "Tercer mensaje de prueba del usuario 1"));
            postsRepository.save(new PostEntity(2L, "Primer mensaje de prueba del usuario 2"));
            postsRepository.save(new PostEntity(2L, "Segundo mensaje de prueba del usuario 2"));
        };
    } 
}
