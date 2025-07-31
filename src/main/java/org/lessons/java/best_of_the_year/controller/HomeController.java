package org.lessons.java.best_of_the_year.controller;

import java.util.ArrayList;

import org.lessons.java.best_of_the_year.classes.Movie;
import org.lessons.java.best_of_the_year.classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Michelangelo");
        return "home";
    }

    @GetMapping("/movies")
    private String getBestMovies(Model model) {

        Movie filmUno = new Movie(1, "Matrix");
        Movie filmDue = new Movie(2, "Titanic");
        Movie filmTre = new Movie(3, "Lotr");
        Movie filmQuattro = new Movie(4, "Harry Potter");

        ArrayList<Movie> listaFilm = new ArrayList<>();

        listaFilm.add(filmUno);
        listaFilm.add(filmDue);
        listaFilm.add(filmTre);
        listaFilm.add(filmQuattro);

        model.addAttribute("films", listaFilm);

        return "movies";
    }

    @GetMapping("/songs")
    public String getBestSongs(Model model) {

        Song canzoneUno = new Song(1, "La guerra di Piero");
        Song canzoneDue = new Song(2, "Help");
        Song canzoneTre = new Song(3, "Satisfaction");
        Song canzoneQuattro = new Song(4, "Smoke on the Water");

        ArrayList<Song> listaCanzoni = new ArrayList<>();

        listaCanzoni.add(canzoneUno);
        listaCanzoni.add(canzoneDue);
        listaCanzoni.add(canzoneTre);
        listaCanzoni.add(canzoneQuattro);

        model.addAttribute("songs", listaCanzoni);

        return "songs";
    }

}
