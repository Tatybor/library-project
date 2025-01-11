package ru.ITGirl.library_project.services;

import ru.ITGirl.library_project.DTO.AuthorDTO;

public interface AuthorService {
    AuthorDTO getAuthorById (Long id);
}
