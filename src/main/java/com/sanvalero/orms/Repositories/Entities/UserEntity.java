package com.sanvalero.orms.Repositories.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Users")
@Entity(name="Users")
public class UserEntity {
    public UserEntity(){}

    public UserEntity(String name, 
                    Long annualSalary,
                    String username,
                    String password){
        this.name = name;
        this.salary = annualSalary;
        this.username = username;
        this.password = password;
    }

    private @Id @GeneratedValue Long id;
    private String name;
    private String username;
    private String password;
    private Long salary;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Long getSalary() {
        return salary;
    }
    public void setSalary(Long salary) {
        this.salary = salary;
    }

    
}
