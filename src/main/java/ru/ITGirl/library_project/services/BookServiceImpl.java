package ru.ITGirl.library_project.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ITGirl.library_project.DTO.BookDTO;
import ru.ITGirl.library_project.entity.Book;
import ru.ITGirl.library_project.repository.BookRepository;
import java.util.List;


@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    public Book addNewBook;

    public Book addNewBook (Book book){
        return bookRepository.save(book);
    }

    @Override
    public BookDTO getBookById (Long id){
        Book book = bookRepository.findById(id).orElseThrow();
        return convertToDTO(book);

    }

    private BookDTO convertToDTO (Book book){
            return BookDTO.builder()

                    .id(book.getId())
                    .name(book.getName())
                    .genre(book.getGenre().getName())
                    .build();
            }

}
