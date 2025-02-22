package ru.netology.dataClasses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DataMovie {
    private int ID;  // Уникальный ID фильма на площадке
    private String movieTitle;  // Название фильма
    private String filmGenre;  // Жанр фильма
    private String srcImg;  // Путь до файла обложки
    private int moveRating; // Рейтинг фильма
}
