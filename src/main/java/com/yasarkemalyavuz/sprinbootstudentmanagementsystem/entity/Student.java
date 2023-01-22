package com.yasarkemalyavuz.sprinbootstudentmanagementsystem.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Ogrenci")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @Column(name = "SalıhCan")
    private String fatherName;


    public Student(int id, String name, String fatherName) {
        this.id = id;
        this.name = name;
        this.fatherName = fatherName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
}