package com.example.demo.model.dto;

import com.example.demo.model.entities.BookDates;
import com.example.demo.model.entities.PhotoPaths;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HouseDto {
    private Long id;
    private String houseName;
    private String price;
    private String description;
    private List<PhotoPaths> photosPaths;
    private List<BookDates> bookDates;
    private String mapPath;

    public Long getId() {
        return id;
    }

    public String getHouseName() {
        return houseName;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public List<PhotoPaths> getPhotosPaths() {
        return photosPaths;
    }

    public List<BookDates> getBookDates() {
        return bookDates;
    }

    public Long getBookDatesId () {
        try {
            return bookDates.get(-1).getId();
        } catch (Exception e) {
            return null;
        }
    }

    public String getMapPath() {
        return mapPath;
    }
}
