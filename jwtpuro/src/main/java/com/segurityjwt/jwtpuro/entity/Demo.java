package com.segurityjwt.jwtpuro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Demo {

    @Id    
    Long id;
    String description;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

}
