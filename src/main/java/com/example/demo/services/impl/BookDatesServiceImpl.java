package com.example.demo.services.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.mapper.BookDatesMapper;
import com.example.demo.model.dto.BookDatesDto;
import com.example.demo.model.entities.BookDates;
import com.example.demo.model.repositories.BookDatesRepository;
import com.example.demo.services.interfaces.BookDatesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;



@Service
@AllArgsConstructor
public class BookDatesServiceImpl implements BookDatesService {
    private BookDatesRepository bookDatesRepository;
    @Override
    public BookDatesDto createBookDates(BookDatesDto bookDatesDto) {
        BookDates bookDates = BookDatesMapper.mapToBookDates(bookDatesDto);
        BookDates savedBookDates = bookDatesRepository.save(bookDates);
        return BookDatesMapper.mapToBookDatesDto(savedBookDates);
    }

    @Override
    public BookDatesDto getBookDatesById(Long bookDatesId) {
        BookDates bookDates = bookDatesRepository.findById(bookDatesId)
                .orElseThrow(() -> new ResourceNotFoundException("Не найдено домов с id: " + bookDatesId));
        return BookDatesMapper.mapToBookDatesDto(bookDates);
    }

    @Override
    public BookDatesDto updateBookDates(Long bookDatesId, BookDatesDto bookDatesDto) {
        BookDates bookDates = bookDatesRepository.findById(bookDatesId)
                .orElseThrow(() -> new ResourceNotFoundException("Не найдено домов с id: " + bookDatesId));
        bookDates.setStartDate(bookDatesDto.getStartDate());
        bookDates.setEndDate(bookDatesDto.getEndDate());
        bookDates.setHouseId(bookDatesDto.getHouseId());
        BookDates updatedBookDatesObj = bookDatesRepository.save(bookDates);
        return BookDatesMapper.mapToBookDatesDto(updatedBookDatesObj);
    }
    @Override
    public void deleteBookDates(Long bookDatesId) {
        bookDatesRepository.deleteById(bookDatesId);
    }


}
