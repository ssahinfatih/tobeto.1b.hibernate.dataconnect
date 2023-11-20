package com.tobeto.spring.b.controllers;


import com.tobeto.spring.b.entities.Order;
import com.tobeto.spring.b.entities.Staff;
import com.tobeto.spring.b.repositories.OrderRepository;
import com.tobeto.spring.b.repositories.StaffRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/staff")
public class StaffController {
    private final StaffRepository staffRepository;

    public StaffController(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @GetMapping
    public List<Staff> getAll() {return staffRepository.findAll();}

    @GetMapping("{id}")
    public Staff getById(@PathVariable int id){
        return staffRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody Staff staff) {
        staffRepository.save(staff);
    }

    @PutMapping("{id}")
    public void update(@PathVariable int id, @RequestBody Order updateOrder) {
        Staff staffUpdate = staffRepository.findById(id).orElseThrow();
        staffUpdate.setName(staffUpdate.getName());
        staffUpdate.setSurname(staffUpdate.getSurname());


        staffRepository.save(staffUpdate);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        Staff staffDelete = staffRepository.findById(id).orElseThrow();
        staffRepository.delete(staffDelete);
    }

}
