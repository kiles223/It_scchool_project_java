package com.example.demo.Controllers.Rest;

import com.example.demo.mapper.BookDatesMapper;
import com.example.demo.model.dto.BookDatesDto;
import com.example.demo.services.interfaces.BookDatesService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@AllArgsConstructor
@RestController
@RequestMapping("/api/bookDates")
public class BookDatesController {
    private BookDatesService bookDatesService;
    // Добавление Даты бронирования дома REST API
    @PostMapping
    public ResponseEntity<BookDatesDto> createBookDates(@RequestBody BookDatesDto bookDatesDto) {
        System.out.println("Это книга даты");
        BookDatesDto savedBookDates = bookDatesService.createBookDates(bookDatesDto);
        return new ResponseEntity<>(savedBookDates, HttpStatus.CREATED);
    }
    // Получение даты бронирования дома REST API
    @GetMapping("{id}")
    public ResponseEntity<BookDatesDto> getBookDates(@PathVariable long id) {
        BookDatesDto bookDatesDto = bookDatesService.getBookDatesById(id);
        return ResponseEntity.ok(bookDatesDto);
    }
    // Изменение даты бронирования дома REST API
    @PutMapping("{id}")
    public ResponseEntity<BookDatesDto> updateBookDates(@PathVariable long id,
                                                        @RequestBody BookDatesDto updatedBookDatesDto) {
        BookDatesDto bookDatesDto = bookDatesService.updateBookDates(id, updatedBookDatesDto);
        return ResponseEntity.ok(bookDatesDto);
    }
    // Удаление даты бронирования дома REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteBookDates(@PathVariable long id) {
        bookDatesService.deleteBookDates(id);
        return ResponseEntity.ok("Дата успешно удалена");
    }

}
