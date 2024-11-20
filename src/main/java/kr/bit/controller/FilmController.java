package kr.bit.controller;

import kr.bit.model.Film;
import kr.bit.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/films")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @GetMapping
    public String listFilms(Model model) {
        List<Film> films = filmService.getAllFilms();
        model.addAttribute("films", films);
        return "filmList";
    }

    @GetMapping("/{id}")
    public String viewFilm(@PathVariable("id") int id, Model model) {
        Film film = filmService.getFilmById(id);
        model.addAttribute("film", film);
        return "filmDetail";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("film", new Film());
        return "filmForm";
    }

    @PostMapping("/add")
    public String addFilm(@ModelAttribute Film film) {
        filmService.addFilm(film);
        return "redirect:/films";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") int id, Model model) {
        Film film = filmService.getFilmById(id);
        model.addAttribute("film", film);
        return "filmForm";
    }

    @PostMapping("/edit/{id}")
    public String updateFilm(@PathVariable("id") int id, @ModelAttribute Film film) {
        film.setFilmId(id);
        filmService.updateFilm(film);
        return "redirect:/films";
    }

    @GetMapping("/delete/{id}")
    public String deleteFilm(@PathVariable("id") int id) {
        filmService.deleteFilm(id);
        return "redirect:/films";
    }

    @GetMapping("/search")
    public String searchFilms(@RequestParam("title") String title, Model model) {
        List<Film> films = filmService.getFilmsByTitle(title);
        model.addAttribute("films", films);
        return "filmList";
    }
}