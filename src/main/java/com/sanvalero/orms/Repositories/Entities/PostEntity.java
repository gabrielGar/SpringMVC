package com.sanvalero.orms.Repositories.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Posts")
@Entity(name="Posts")
public class PostEntity {
    public PostEntity(){}

    public PostEntity(Long userId, String text){
        this.userId = userId;
        this.text = text;
    }
    private @Id @GeneratedValue Long id;
    private Long userId;
    private String text;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    
}
