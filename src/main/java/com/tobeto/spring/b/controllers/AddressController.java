package com.tobeto.spring.b.controllers;



import com.tobeto.spring.b.entities.Address;
import com.tobeto.spring.b.repositories.AddressRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/address")
public class AddressController {

    private final AddressRepository addressRepository;

    public  AddressController(AddressRepository addressRepository){
        this.addressRepository=addressRepository;
    }

    @GetMapping
    public List<Address> getAll(){
        return addressRepository.findAll();
    }

    @GetMapping("{id}")
    public Address getById(@PathVariable int id){
        // optional<T> -- ilgili filtreden bbir veri dönmeyebilir
        return addressRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody Address address){
        addressRepository.save(address);
    }

    @PutMapping("{id}")
    public void  update(@PathVariable int id,@RequestBody Address address){
        Address updateAddress = addressRepository.findById(id).orElseThrow();
        updateAddress.setCustomer(address.getCustomer());
        updateAddress.setCity(address.getCity());
        updateAddress.setCountry(address.getCountry());
        updateAddress.setComment(address.getComment());

        addressRepository.save(updateAddress);
    }

    @DeleteMapping("{id}")
    public void  delete (@PathVariable int id){
        //Car carToDelete = carRepository.findById(id).orElseThrow();
        // carRepository.delete(carToDelete);
        addressRepository.deleteById(id);

    }
}
