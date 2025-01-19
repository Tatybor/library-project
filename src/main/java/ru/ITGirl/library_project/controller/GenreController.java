package ru.ITGirl.library_project.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.ITGirl.library_project.DTO.BookDTO;
import ru.ITGirl.library_project.DTO.GenreDTO;
import ru.ITGirl.library_project.entity.Book;
import ru.ITGirl.library_project.entity.Genre;
import ru.ITGirl.library_project.services.BookServiceImpl;
import ru.ITGirl.library_project.services.GenreServiceImpl;

@RestController
@RequiredArgsConstructor
public class GenreController {

    private final GenreServiceImpl genreServiceImpl;

    @PostMapping ("/genres")
    public Genre addNewGenre(@RequestBody Genre genre) {
        return genreServiceImpl.addNewGenre (genre);
    }

    @GetMapping("/genres/{id}")
    GenreDTO getGenreById(@PathVariable("id") Long id) {
        return genreServiceImpl.getGenreById(id);
    }
}




