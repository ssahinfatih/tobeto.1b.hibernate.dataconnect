package com.tobeto.spring.b.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

//ORM konusu
@Table(name="cars")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity//tabloyu class haline getiren anotation
public class Car
{
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//id otamatik olarak arttığını belirtiiz.
    private  int id;
    @Column(name="brand")
    private String brand;
    @Column(name="model")
    private String model;
    @Column(name="number_plate")
    private String numberPlate;
    @Column(name="type")
    private String type;
    @Column(name="kilometer")
    private int kilometer;

    @OneToMany(mappedBy = "car")
    @JsonIgnore
    private List<Order> orders;


}
