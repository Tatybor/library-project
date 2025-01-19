package ru.ITGirl.library_project.services;

import ru.ITGirl.library_project.DTO.BookDTO;
import ru.ITGirl.library_project.DTO.GenreDTO;

public interface GenreService {
    GenreDTO getGenreById (Long id);
}
