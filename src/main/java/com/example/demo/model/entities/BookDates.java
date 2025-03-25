package com.example.demo.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name="book_dates")
public class BookDates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, name = "house_id")
    private Long houseId;
    @Column(name = "selected_date_start")
    private String selectedDateStart;
    @Column(name = "selected_date_end")
    private String selectedDateEnd;
}
