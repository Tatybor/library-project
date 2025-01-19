package ru.ITGirl.library_project.services;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ITGirl.library_project.DTO.AuthorDTO;
import ru.ITGirl.library_project.DTO.BookDTO;
import ru.ITGirl.library_project.entity.Author;
import ru.ITGirl.library_project.repository.AuthorRepository;

import java.util.List;


@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;
    public Author addNewAuthor;

    public Author addNewAuthor (Author author){
        return authorRepository.save(author);
    }

    @Override
    public AuthorDTO getAuthorById (Long id){
        Author author = authorRepository.findById(id).orElseThrow();
        return convertToDTO(author);

    }

    private AuthorDTO convertToDTO (Author author){

            List<BookDTO> bookDtoList = author.getBooks()
                    .stream()
                    .map(book -> BookDTO.builder()
                            .genre(book.getGenre().getName())
                            .name(book.getName())
                            .id(book.getId())
                            .build()
                    ).toList();

            return AuthorDTO.builder()
                    .books(bookDtoList)
                    .id(author.getId())
                    .name(author.getName())
                    .surname(author.getSurname())
                    .build();
            }

}
