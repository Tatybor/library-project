package ru.ITGirl.library_project.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.ITGirl.library_project.DTO.AuthorDTO;
import ru.ITGirl.library_project.DTO.BookDTO;
import ru.ITGirl.library_project.entity.Author;
import ru.ITGirl.library_project.entity.Book;
import ru.ITGirl.library_project.services.AuthorServiceImpl;
import ru.ITGirl.library_project.services.BookServiceImpl;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookServiceImpl bookServiceImpl;

    @PostMapping ("/books")
    public Book addNewBook(@RequestBody Book book) {
        return bookServiceImpl.addNewBook (book);
    }

    @GetMapping("/books/{id}")
    BookDTO getBookById(@PathVariable("id") Long id) {
        return bookServiceImpl.getBookById(id);
    }
}




