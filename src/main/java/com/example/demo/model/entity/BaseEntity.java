package com.example.demo.model.entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {
    private String ID;

    public BaseEntity(){
    }

    @Id
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}

