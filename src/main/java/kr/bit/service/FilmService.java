package kr.bit.service;

import kr.bit.model.Film;
import java.util.List;

public interface FilmService {
    void addFilm(Film film);
    Film getFilmById(int filmId);
    List<Film> getAllFilms();
    void updateFilm(Film film);
    void deleteFilm(int filmId);
    List<Film> getFilmsByTitle(String title);
    List<Film> getFilmsByReleaseYear(Short releaseYear);
    List<Film> getFilmsByLanguageId(byte languageId);
    List<Film> getFilmsByRating(String rating);
}