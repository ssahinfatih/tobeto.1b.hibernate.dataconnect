package com.tobeto.spring.b.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Table(name="orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Order {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//id otamatik olarak arttığını belirtiiz.
    private  int id;

    @ManyToOne
    @JoinColumn(name="car_id")
    private Car car;
    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;
    @Column(name="order_date")
    private String orderDate;
    @Column(name="start_date")
    private  String startDate;
    @Column(name="end_date")
    private String endDate;
    @Column(name="discount")
    private int discount;
    @Column(name="price")
    private int price;
}
