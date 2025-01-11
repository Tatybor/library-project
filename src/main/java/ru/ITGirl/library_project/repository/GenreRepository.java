package ru.ITGirl.library_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ITGirl.library_project.entity.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
