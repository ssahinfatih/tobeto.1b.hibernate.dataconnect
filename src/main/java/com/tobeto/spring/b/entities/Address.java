package com.tobeto.spring.b.entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name="address")
@Entity
public class Address

{
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//id otamatik olarak arttığını belirtiiz.
    private  int id;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;
    @Column(name="city")
    private String city;
    @Column(name="country")
    private String country;
    @Column(name="comment")
    private String comment;

}
