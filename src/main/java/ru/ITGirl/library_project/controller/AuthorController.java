package ru.ITGirl.library_project.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.ITGirl.library_project.entity.Author;
import ru.ITGirl.library_project.DTO.AuthorDTO;
import ru.ITGirl.library_project.services.AuthorServiceImpl;

@RestController
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorServiceImpl authorServiceImpl;

    @PostMapping ("/authors")
    public Author addNewAuthor(@RequestBody Author author) {
        return authorServiceImpl.addNewAuthor (author);
    }

    @GetMapping("/authors/{id}")
    AuthorDTO getAuthorById(@PathVariable("id") Long id) {
        return authorServiceImpl.getAuthorById(id);
    }
}




