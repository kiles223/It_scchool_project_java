package com.example.demo.model.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "photos_paths")
public class PhotoPaths {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, name = "house_id")
    private Long houseId;
    @Column(name = "photo_path")
    private String photoPath;

}
