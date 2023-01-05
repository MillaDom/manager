package ru.netology.javaqa.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FilmManagerTest {
    String film1 = "Film A";
    String film2 = "Film B";
    String film3 = "Film C";
    String film4 = "Film D";
    String film5 = "Film E";
    String film6 = "Film F";
    String film7 = "Film G";
    String film8 = "Film H";
    String film9 = "Film I";
    String film10 = "Film J";
    String film11 = "Film K";

    @Test

    public void getFilms() {
        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);

        String[] expected = {film1, film2, film3, film4, film5};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldListFindLast() {
        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);


        String[] expected = {film5, film4, film3, film2, film1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldListFindLastUpLimit() {
        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);


        String[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldListFindLastWithParameter() {
        FilmManager manager = new FilmManager(5);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);


        String[] expected = {film11, film10, film9, film8, film7};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldListFindLastWithParameterUnderLimit() {
        FilmManager manager = new FilmManager(5);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] expected = {film3, film2, film1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}