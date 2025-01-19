package ru.ITGirl.library_project.services;

import ru.ITGirl.library_project.DTO.AuthorDTO;
import ru.ITGirl.library_project.DTO.BookDTO;

public interface BookService {
    BookDTO getBookById (Long id);
}
