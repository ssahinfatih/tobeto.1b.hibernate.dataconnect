package com.tobeto.spring.b.repositories;


import com.tobeto.spring.b.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

//Data JPA
//Generic - türleri reference type olmak zorundadır (int -> Integer)
public interface CarRepository extends JpaRepository<Car, Integer>
{
    //veri erişim katmanı objesi

}
