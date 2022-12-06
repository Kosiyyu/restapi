package com.proj.restapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "student")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
    @SequenceGenerator(name="student_seq",sequenceName="student_seq", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "birthday_date")
    private LocalDateTime birthdayDate;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "telephone_number")
    private String telephoneNumber;

    public Student(){
    }

    public Student(String firstname, String lastname, LocalDateTime birthdayDate, String address, String email, String telephoneNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdayDate = birthdayDate;
        this.address = address;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
    }

    public Student(Long id, String firstname, String lastname, LocalDateTime birthdayDate, String address, String email, String telephoneNumber) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdayDate = birthdayDate;
        this.address = address;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthdayDate=" + birthdayDate +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                '}';
    }
}


