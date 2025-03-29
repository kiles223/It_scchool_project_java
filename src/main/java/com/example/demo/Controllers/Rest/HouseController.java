package com.example.demo.Controllers.Rest;

import com.example.demo.model.dto.HouseDto;
import com.example.demo.services.interfaces.HouseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/houses")
public class HouseController {
    private HouseService houseService;

    // Добавление дома REST API
    @PostMapping
    public ResponseEntity<HouseDto> createHouse(@RequestBody HouseDto houseDto) {
        HouseDto savedHouse = houseService.createHouse(houseDto);
        return new ResponseEntity<>(savedHouse, HttpStatus.CREATED);
    }
    // Получение дома REST API
    @GetMapping("{id}")
    public ResponseEntity<HouseDto> getHouseById(@PathVariable Long id){
        HouseDto houseDto = houseService.getHouseById(id);
        return ResponseEntity.ok(houseDto);
    }
    // Изменение дома REST API
    @PutMapping("{id}")
    public ResponseEntity<HouseDto> updateHouse(@PathVariable Long id,
                                                @RequestBody HouseDto updatedHouseDto){
        HouseDto houseDto = houseService.updateHouse(id, updatedHouseDto);
        return ResponseEntity.ok(houseDto);
    }
    // Удаление дома REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteHouse(@PathVariable Long id){
        houseService.deleteHouse(id);
        return ResponseEntity.ok("Дом успешно удалён");
    }
}
