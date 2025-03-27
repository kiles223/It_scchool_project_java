package com.example.demo.model.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="book_dates")
public class BookDates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, name = "house_id")
    private Long houseId;
    @Column(name = "booked_date_start")
    private String bookedDateStart;
    @Column(name = "booked_date_end")
    private String bookedDateEnd;

    public String getBookedDateStart() {
        return bookedDateStart;
    }

    public String getBookedDateEnd() {
        return bookedDateEnd;
    }
}
