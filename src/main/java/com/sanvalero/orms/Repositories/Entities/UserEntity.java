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
                    Long annualSalary){
        this.name = name;
        this.salary = annualSalary;
    }

    private @Id @GeneratedValue Long id;
    private String name;
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
    public Long getSalary() {
        return salary;
    }
    public void setSalary(Long salary) {
        this.salary = salary;
    }

    
}
