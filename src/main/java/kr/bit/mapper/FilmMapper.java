package kr.bit.mapper;

import org.apache.ibatis.annotations.Mapper;
import kr.bit.model.Film;
import java.util.List;

@Mapper
public interface FilmMapper {
    void insertFilm(Film film);
    Film selectFilmById(int filmId);
    List<Film> selectAllFilms();
    void updateFilm(Film film);
    void deleteFilm(int filmId);
    List<Film> selectFilmsByTitle(String title);
    List<Film> selectFilmsByReleaseYear(Short releaseYear);
    List<Film> selectFilmsByLanguageId(byte languageId);
    List<Film> selectFilmsByRating(String rating);
}
