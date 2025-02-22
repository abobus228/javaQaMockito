package ru.netology.managers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.dataClasses.DataMovie;

public class MovieManagerTest {

    MovieManager managerNoParameters = new MovieManager();
    MovieManager managerFromParameters = new MovieManager(3);

    DataMovie movie1 = new DataMovie(1, "Бладшот", "Боевик", "src/one.img", 6);
    DataMovie movie2 = new DataMovie(2, "Вперед", "Мультфильм", "src/two.img", 7);
    DataMovie movie3 = new DataMovie(3, "Отель Белград", "Комедия", "src/three.img", 4);
    DataMovie movie4 = new DataMovie(4, "Джентльмены", "Боевик", "src/four.img", 8);
    DataMovie movie5 = new DataMovie(5, "Человек-невидимка", "Ужасы", "src/five.img", 5);
    DataMovie movie6 = new DataMovie(6, "Тролли", "Мультфильм", "src/six.img", 7);
    DataMovie movie7 = new DataMovie(7, "Номер один", "Комедия", "src/seven.img", 4);

    @BeforeEach
    public void setup() {
        managerNoParameters.addMovie(movie1);
        managerNoParameters.addMovie(movie2);
        managerNoParameters.addMovie(movie3);
        managerNoParameters.addMovie(movie4);
        managerNoParameters.addMovie(movie5);
        managerNoParameters.addMovie(movie6);
        managerNoParameters.addMovie(movie7);
    }

//    @Test
//    public void should
}
