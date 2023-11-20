package com.tobeto.spring.b.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name="address")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
