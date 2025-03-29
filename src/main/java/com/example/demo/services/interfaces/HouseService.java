package com.example.demo.services.interfaces;

import com.example.demo.model.dto.HouseDto;

public interface HouseService {
    HouseDto createHouse(HouseDto houseDto);
    HouseDto getHouseById(Long houseId);
    HouseDto updateHouse(Long houseId, HouseDto houseDto);
    void deleteHouse(Long houseId);
}
