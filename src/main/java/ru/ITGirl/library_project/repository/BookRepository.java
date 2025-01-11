package ru.ITGirl.library_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ITGirl.library_project.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
