package ru.ITGirl.library_project.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ITGirl.library_project.DTO.GenreDTO;
import ru.ITGirl.library_project.entity.Genre;
import ru.ITGirl.library_project.repository.GenreRepository;


@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService {

    private final GenreRepository genreRepository;
    public Genre addNewGenre;

    public Genre addNewGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    @Override
    public GenreDTO getGenreById(Long id) {
        Genre genre = genreRepository.findById(id).orElseThrow();
        return convertToDTO(genre);
    }

    private GenreDTO convertToDTO(Genre genre) {
        return GenreDTO.builder()
                .id(genre.getId())
                .name(genre.getName())
                .build();
    }

}
