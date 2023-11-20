package com.tobeto.spring.b.repositories;

import com.tobeto.spring.b.entities.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Integer> {
}
