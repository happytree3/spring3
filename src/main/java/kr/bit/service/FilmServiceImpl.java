package kr.bit.service;

import kr.bit.mapper.FilmMapper;
import kr.bit.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmMapper filmMapper;

    @Override
    public void addFilm(Film film) {
        filmMapper.insertFilm(film);
    }

    @Override
    public Film getFilmById(int filmId) {
        return filmMapper.selectFilmById(filmId);
    }

    @Override
    public List<Film> getAllFilms() {
        return filmMapper.selectAllFilms();
    }

    @Override
    public void updateFilm(Film film) {
        filmMapper.updateFilm(film);
    }

    @Override
    public void deleteFilm(int filmId) {
        filmMapper.deleteFilm(filmId);
    }

    @Override
    public List<Film> getFilmsByTitle(String title) {
        return filmMapper.selectFilmsByTitle(title);
    }

    @Override
    public List<Film> getFilmsByReleaseYear(Short releaseYear) {
        return filmMapper.selectFilmsByReleaseYear(releaseYear);
    }

    @Override
    public List<Film> getFilmsByLanguageId(byte languageId) {
        return filmMapper.selectFilmsByLanguageId(languageId);
    }

    @Override
    public List<Film> getFilmsByRating(String rating) {
        return filmMapper.selectFilmsByRating(rating);
    }
}