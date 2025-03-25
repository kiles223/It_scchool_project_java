package com.example.demo.model.dto;

import com.example.demo.model.entities.BookDates;
import com.example.demo.model.entities.PhotoPaths;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
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
}
