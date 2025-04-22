package com.example.demo.model.repositories;

import com.example.demo.model.entities.BookDates;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookDatesRepository extends JpaRepository<BookDates, Long> {
}
