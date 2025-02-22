package ru.netology.managers;

import ru.netology.dataClasses.DataMovie;

public class MovieManager {
    // Массив со списком фильмов
    public static DataMovie[] listMovie = new DataMovie[0];

    private int movieOutputLimit;  // Лимит вывода фильмов из массива


    public MovieManager() {
        this.movieOutputLimit = 5;
    }

    public MovieManager(int movieOutputLimit) {
        this.movieOutputLimit = movieOutputLimit;
    }

    DataMovie movie1 = new DataMovie(1, "Бладшот", "Боевик", "src/one.img", 6.6);
    DataMovie movie2 = new DataMovie(2, "Вперед", "Мультфильм", "src/two.img", 7.7);
    DataMovie movie3 = new DataMovie(3, "Отель Белград", "Комедия", "src/three.img", 4.3);
    DataMovie movie4 = new DataMovie(4, "Джентльмены", "Боевик", "src/four.img", 8.0);
    DataMovie movie5 = new DataMovie(5, "Человек-невидимка", "Ужасы", "src/five.img", 5.9);
    DataMovie movie6 = new DataMovie(6, "Тролли", "Мультфильм", "src/six.img", 7.8);
    DataMovie movie7 = new DataMovie(7, "Номер один", "Комедия", "src/seven.img", 4.4);

    // Добавление нового фильма в список
    public static void addMovie(DataMovie movie) {
        DataMovie[] tmp = new DataMovie[listMovie.length + 1];
        tmp[tmp.length - 1] = movie;
        listMovie = tmp;
    }

    // Вывод всех фильмов в порядке добавления
    public static void findAll() {
        for (DataMovie movie : listMovie) {
            System.out.printf("Номер: %d, \nНазвание фильма: %s, \nЖанр: %s, \nРейтинг: %f",
                    movie.getID(), movie.getMovieTitle(), movie.getFilmGenre(), movie.getMoveRating());
        }
    }

    // Вывод фильмов в обратном порядке добавления в заданном количестве
    public void findLast() {
        DataMovie[] listResult = new DataMovie[listMovie.length < this.movieOutputLimit ? listMovie.length : this.movieOutputLimit];

        for (int i = 0; i < listResult.length; i++) {
            listResult[i] = listMovie[listMovie.length - 1 - i];
        }

        // Вывод фильмов из списка с результатом
        for (DataMovie movie : listResult) {
            System.out.printf("Номер: %d, \nНазвание фильма: %s, \nЖанр: %s, \nРейтинг: %f",
                    movie.getID(), movie.getMovieTitle(), movie.getFilmGenre(), movie.getMoveRating());
        }

    }
}
