package com.maxim.api.models;

import jakarta.persistence.*;

@Entity()
@Table(name="student_details")
public class StudentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="age")
    private int age;

    @Column(name = "hobby")
    private String hobby;

    @OneToOne(mappedBy = "studentDetails", cascade = CascadeType.ALL)
    Student student;
    public StudentDetails() {}
    public StudentDetails(int age, String hobby) {
        this.age = age;
        this.hobby = hobby;
    }

    public int getAge()  { return age; }

    public String getHobby() {
        return hobby;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
