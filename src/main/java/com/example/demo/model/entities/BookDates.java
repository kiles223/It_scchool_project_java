package com.example.demo.model.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="book_dates")
public class BookDates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, name = "house_id")
    private Long houseId;
    @Column(name = "booked_date_start")
    private String startDate;
    @Column(name = "booked_date_end")
    private String endDate;

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
}
