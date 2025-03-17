package com.example.demo.mapper;

import com.example.demo.model.dto.HouseDto;
import com.example.demo.model.entities.House;

public class HouseMapper {
    public static HouseDto mapToHouseDto(House house) {
        return new HouseDto(
                house.getId(),
                house.getHouseName(),
                house.getPrice(),
                house.getDescription()
        );
    }

    public static House mapToHouse(HouseDto houseDto) {
        return new House(
                houseDto.getId(),
                houseDto.getHouseName(),
                houseDto.getPrice(),
                houseDto.getDescription()
        );
    }
}
