package com.sanvalero.orms.Services.Models;

public class PostDTO {
    public PostDTO(){}

    public PostDTO(PostDTO p, String userName){
        this.id = p.getId();
        this.userId = p.getUserId();
        this.text = p.getText();
        this.userName = userName;
    }
    public Long id;
    public Long userId;
    public String userName;
    public String text;
    
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
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    
}
