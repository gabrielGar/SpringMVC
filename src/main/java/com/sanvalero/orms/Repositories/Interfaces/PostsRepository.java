package com.sanvalero.orms.Repositories.Interfaces;

import java.util.List;

import com.sanvalero.orms.Repositories.Entities.PostEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PostsRepository 
        extends JpaRepository<PostEntity, Long>{
    
    @Query("SELECT p FROM Posts p WHERE userId = :userId")
    List<PostEntity> getAllByUserId(
        @Param("userId") Long userId);

    @Query("SELECT u.name, p " +
            " FROM Posts p " +
            " INNER JOIN Users u ON p.userId = u.id " +
            " WHERE salary > :salary")
    List<Object[]> getAllBySalaryHigherThan(
        @Param("salary") Long salary);
        
}
