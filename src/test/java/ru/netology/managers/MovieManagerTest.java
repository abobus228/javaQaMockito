package ru.netology.managers;

import org.junit.jupiter.api.Assertions;
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

    @Test  // Проверка добавления фильмов в список
    public void shouldAddAllMoviesInList() {
        DataMovie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        DataMovie[] actual = managerNoParameters.listMovie;

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test  // Проверка, все ли фильмы выводятся при полном выводе списка
    public void shouldReturnCountMoviesFullList() {
        managerNoParameters.findAll();

        int expected = 7;
        int actual = managerNoParameters.countReturnMovies;

        Assertions.assertEquals(expected, actual);
    }

    @Test  // Проверка, количества возвращаемых фильмов в обратном порядке при лимите заданным стандартным значением
    public void shouldReturnListInReverseOrderOf5() {
        managerNoParameters.findLast();

        int expected = 5;
        int actual = managerNoParameters.countReturnMovies;

        Assertions.assertEquals(expected, actual);
    }

    @Test  // Проверка, количества возвращаемых фильмов в обратном порядке при лимите заданным вручную (количество = 3)
    public void shouldReturnListInReverseOrderOf3() {
        managerFromParameters.addMovie(movie1);
        managerFromParameters.addMovie(movie2);
        managerFromParameters.addMovie(movie3);
        managerFromParameters.addMovie(movie4);
        managerFromParameters.addMovie(movie5);
        managerFromParameters.addMovie(movie6);
        managerFromParameters.addMovie(movie7);

        managerFromParameters.findLast();

        int expected = 3;
        int actual = managerFromParameters.countReturnMovies;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    // Проверка, количества возвращаемых фильмов в обратном порядке при лимите (стандартном = 5) больше размера списка
    public void shouldReturnListInReverseOrderOfBellowNumber5() {
        MovieManager manager = new MovieManager();

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);

        manager.findLast();

        int expected = 3;
        int actual = manager.countReturnMovies;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    // Проверка, количества возвращаемых фильмов в обратном порядке при лимите (заданном вручную = 3) больше размера списка
    public void shouldReturnListInReverseOrderOfBellowNumber3() {
        managerFromParameters.addMovie(movie1);
        managerFromParameters.addMovie(movie2);

        managerFromParameters.findLast();

        int expected = 2;
        int actual = managerFromParameters.countReturnMovies;

        Assertions.assertEquals(expected, actual);
    }
}
