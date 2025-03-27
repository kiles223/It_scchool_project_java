package com.example.demo.model.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="houses")
public class House{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "house_name")
    private String houseName;
    @Column(name = "price")
    private String price;
    @Column(name = "description")
    private String description;
    @OneToMany
    @JoinColumn(name = "house_id")
    private List<PhotoPaths> photosPaths;
    @OneToMany
    @JoinColumn(name = "house_id")
    private List<BookDates> bookDates;
    @Column(name = "map_path")
    private String mapPath;

}

