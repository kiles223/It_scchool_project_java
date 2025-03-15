package com.example.demo.model;
/*
Что должно быть у дома ( его описания )
Название ( ДОМ №... "....." )
Цена за сутки ( ..... ₽ )
Описание

Фотографии
Календарь и даты бронирования, когда он занят
Отображение на карте?????
 */
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class House {

    String name;
    String price;
    String description;

}
