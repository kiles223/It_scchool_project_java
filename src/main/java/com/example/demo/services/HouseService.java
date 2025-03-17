package com.example.demo.services;

import com.example.demo.model.dto.HouseDto;
import com.example.demo.model.entities.House;
import com.example.demo.model.repositories.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface HouseService {
    HouseDto createHouse(HouseDto houseDto);
    HouseDto getHouseById(Long houseId);
    HouseDto updateHouse(Long houseId, HouseDto houseDto);
    void deleteHouse(Long houseId);
}
