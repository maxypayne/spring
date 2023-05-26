package com.maxim.api.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity()
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="firstName")
    private String firstName;
    @Column(name="lastName")
    private String lastName;
    @Column(name="email")
    private String email;

    @OneToOne(cascade = { CascadeType.ALL, CascadeType.DETACH })
    @JoinColumn(name = "student_details_id", referencedColumnName = "id")
    @JsonProperty("studentDetails")
    private StudentDetails studentDetails;

    public Student() {}
    public Student(String firstName, String lastName, String email, StudentDetails details) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.studentDetails = details;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", studentDetails=" + studentDetails +
                '}';
    }
}
