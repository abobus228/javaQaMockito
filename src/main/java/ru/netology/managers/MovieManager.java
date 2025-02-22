package ru.netology.managers;

import ru.netology.dataClasses.DataMovie;

public class MovieManager {
    // Массив со списком фильмов
    public DataMovie[] listMovie = new DataMovie[0];

    private int movieOutputLimit;  // Лимит вывода фильмов из массива


    public MovieManager() {
        this.movieOutputLimit = 5;
    }

    public MovieManager(int movieOutputLimit) {
        this.movieOutputLimit = movieOutputLimit;
    }

    // Добавление нового фильма в список
    public void addMovie(DataMovie movie) {
        DataMovie[] tmp = new DataMovie[listMovie.length + 1];

        for (int i = 0; i < listMovie.length; i++) {
            tmp[i] = listMovie[i];
        }

        tmp[tmp.length - 1] = movie;
        listMovie = tmp;
    }

    // Вывод всех фильмов в порядке добавления
    public void findAll() {
        for (DataMovie movie : listMovie) {
            System.out.printf("Номер: %d \nНазвание фильма: %s \nЖанр: %s \nРейтинг: %d",
                    movie.getID(), movie.getMovieTitle(), movie.getFilmGenre(), movie.getMoveRating());
            System.out.println("\n");
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
            System.out.printf("Номер: %d \nНазвание фильма: %s \nЖанр: %s \nРейтинг: %d",
                    movie.getID(), movie.getMovieTitle(), movie.getFilmGenre(), movie.getMoveRating());
            System.out.println("\n");
        }

    }
}
