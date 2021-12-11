package com.sanvalero.orms.Web.Config;

import com.sanvalero.orms.Repositories.Entities.UserEntity;
import com.sanvalero.orms.Repositories.Interfaces.UsersRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitDB {
    @Bean
    CommandLineRunner initDatabase(UsersRepository usersRepository){
        return args -> {
            usersRepository.save(new UserEntity("User 1"));
            usersRepository.save(new UserEntity("User 2"));
            usersRepository.save(new UserEntity("User 3"));
        };
    } 
}
