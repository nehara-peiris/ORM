package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.example.embed.FullName;

@Entity
public class Student {

    @Id
    private int id;
    private FullName name;
    private String address;

    public Student() {
    }

    public Student(int id, FullName name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public FullName getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



}
