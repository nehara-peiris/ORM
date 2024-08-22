package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.example.embed.FullName;

@Entity
public class Lecturer {

    @Id
    private int id;
    private FullName fullname;
    private String address;
    private int yrsOfExp;

    public Lecturer() {
    }

    public Lecturer(int id, FullName fullname, String address, int yrsOfExp) {
        this.id = id;
        this.fullname = fullname;
        this.address = address;
        this.yrsOfExp = yrsOfExp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FullName getFullname() {
        return fullname;
    }

    public void setFullname(FullName fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYrsOfExp() {
        return yrsOfExp;
    }

    public void setYrsOfExp(int yrsOfExp) {
        this.yrsOfExp = yrsOfExp;
    }
}
