package com.tobeto.spring.b.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name="customers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer
{
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//id otamatik olarak arttığını belirtiiz.
    private  int id;
    @Column(name="Name")
    private String name;
    @Column(name="Surname")
    private String surname;
    @Column(name="Phone")
    private String phone;
    @Column(name="Age")
    private int age;
    @Column(name="E-mail")
    private String eMail;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Order> orders;
    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Address> addresses;


}
