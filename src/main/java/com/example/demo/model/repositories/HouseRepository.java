package com.example.demo.model.repositories;

import com.example.demo.model.entities.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<House, Long> {
}
