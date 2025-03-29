package com.example.demo.mapper;

import com.example.demo.model.dto.BookDatesDto;
import com.example.demo.model.entities.BookDates;

public class BookDatesMapper {
    public static BookDatesDto mapToBookDatesDto(BookDates bookDates) {
        return new BookDatesDto(
                bookDates.getId(),
                bookDates.getHouseId(),
                bookDates.getStartDate(),
                bookDates.getEndDate()
        );
    }
    public static BookDates mapToBookDates(BookDatesDto bookDatesDto) {
        return new BookDates(
                bookDatesDto.getId(),
                bookDatesDto.getHouseId(),
                bookDatesDto.getStartDate(),
                bookDatesDto.getEndDate()
        );

    }
}
