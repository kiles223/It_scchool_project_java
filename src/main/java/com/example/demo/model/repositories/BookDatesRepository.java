package com.example.demo.model.repositories;

import com.example.demo.model.entities.BookDates;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDatesRepository extends JpaRepository<BookDates, Long> {
}
