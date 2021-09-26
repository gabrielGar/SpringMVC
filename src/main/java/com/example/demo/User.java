package com.example.demo;

public class User {
    public User(){ }

    public User(int _id, String _name){
        this.id = _id;
        this.name = _name;
    }

    private int id;
    public int getId() { return id; }
    public void setId(int id) { this.id = id;}

    private String name;
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
