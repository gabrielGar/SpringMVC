package com.example.demo;

public class UserV2 extends User {
    public UserV2(){ }

    public UserV2(int _id, String _name, String _lang){
        super(_id, _name);
        this.lang = _lang;
        setPostsURL();
    }

    private String lang;
    public String getLang() { return lang; }
    public void setLang(String lang) { this.lang = lang; }

    private String postsURL;
    public String getPostsURL() {
        return postsURL;
    }
    public void setPostsURL() {
        this.postsURL = Constants.BASE_URL + "/posts?userId=" + getId();
    }
    
}
