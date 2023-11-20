package com.tobeto.spring.b.entities;

import jakarta.persistence.*;
import lombok.*;

@Table(name="staff")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Staff {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//id otamatik olarak arttığını belirtiiz.
    private  int id;
    @Column(name="name")
    private String name;
    @Column(name="surname")
    private String surname;
}
