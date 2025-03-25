package com.example.demo.services.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.mapper.HouseMapper;
import com.example.demo.model.dto.HouseDto;
import com.example.demo.model.entities.House;
import com.example.demo.model.repositories.HouseRepository;
import com.example.demo.services.HouseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HouseServiceImpl implements HouseService {

    private HouseRepository houseRepository;
    @Override
    public HouseDto createHouse(HouseDto houseDto) {

        House house = HouseMapper.mapToHouse(houseDto);
        House savedHouse = houseRepository.save(house);
        return HouseMapper.mapToHouseDto(savedHouse);
    }

    @Override
    public HouseDto getHouseById(Long houseId) {
        House house = houseRepository.findById(houseId)
                .orElseThrow(() -> new ResourceNotFoundException("Не найдено домов с id: " + houseId));
        return HouseMapper.mapToHouseDto(house);
    }
//    public List<HouseDto> getAllHouses() {
//
//    }
    @Override
    public HouseDto updateHouse(Long houseId, HouseDto houseDto) {
        House house = houseRepository.findById(houseId)
                .orElseThrow(() -> new ResourceNotFoundException("Не найдено домов с id: " + houseId));
        house.setHouseName(houseDto.getHouseName());
        house.setDescription(houseDto.getDescription());
        house.setPrice(houseDto.getPrice());
        house.setPhotosPaths(houseDto.getPhotosPaths());
        house.setBookDates(houseDto.getBookDates());
        house.setMapPath(houseDto.getMapPath());
        House updatedHouseObj = houseRepository.save(house);
        return HouseMapper.mapToHouseDto(updatedHouseObj);
    }

    @Override
    public void deleteHouse(Long houseId) {
        House house = houseRepository.findById(houseId)
                .orElseThrow(() -> new ResourceNotFoundException("Не найдено домов с id: " + houseId));
        houseRepository.deleteById(houseId);
    }
}
