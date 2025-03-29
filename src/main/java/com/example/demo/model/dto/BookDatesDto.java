package com.example.demo.model.dto;

import lombok.*;


@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDatesDto {
    private Long id;
    private Long houseId;
    private String startDate;
    private String endDate;

    public Long getId() {
        return id;
    }

    public Long getHouseId() {
        return houseId;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
}
