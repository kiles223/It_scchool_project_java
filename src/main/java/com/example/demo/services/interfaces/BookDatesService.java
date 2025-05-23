package com.example.demo.services.interfaces;

import com.example.demo.model.dto.BookDatesDto;

import java.util.List;

public interface BookDatesService {
    BookDatesDto createBookDates(BookDatesDto bookDatesDto);
    BookDatesDto getBookDatesById(Long BookDatesId);
    BookDatesDto updateBookDates(Long BookDatesId, BookDatesDto bookDatesDto);
    void deleteBookDates(Long BookDatesId);
    List<BookDatesDto> getAllBookDates();
}
