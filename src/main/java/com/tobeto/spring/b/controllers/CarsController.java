package com.tobeto.spring.b.controllers;


import com.tobeto.spring.b.entities.Car;
import com.tobeto.spring.b.repositories.CarRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/car")
public class CarsController {
    //Dependencyy => bağımlılık
    //Injection => Enjekte

    private final CarRepository carRepository;
    //final - set edilemez
    public  CarsController(CarRepository carRepository){
        this.carRepository=carRepository;
    }

    @GetMapping
    public List<Car> getAll(){
        return carRepository.findAll();
    }

    @GetMapping("{id}")
    public Car getById(@PathVariable int id){
        // optional<T> -- ilgili filtreden bbir veri dönmeyebilir
        return carRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody Car car){
        carRepository.save(car);
    }

    @PutMapping("{id}")
    public void  update(@PathVariable int id,@RequestBody Car car){
        Car updateCar = carRepository.findById(id).orElseThrow();
        updateCar.setBrand(car.getBrand());
        updateCar.setModel(car.getModel());
        updateCar.setNumberPlate(car.getNumberPlate());
        updateCar.setType(car.getType());
        updateCar.setKilometer(car.getKilometer());

        carRepository.save(updateCar);
    }

    @DeleteMapping("{id}")
    public void  delete (@PathVariable int id){
        //Car carToDelete = carRepository.findById(id).orElseThrow();
       // carRepository.delete(carToDelete);
        carRepository.deleteById(id);

    }

}
