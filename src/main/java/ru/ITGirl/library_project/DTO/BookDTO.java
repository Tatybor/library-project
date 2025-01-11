package ru.ITGirl.library_project.DTO;

import jakarta.persistence.*;
import lombok.*;
import ru.ITGirl.library_project.entity.Author;
import ru.ITGirl.library_project.entity.Genre;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BookDTO {

    private Long id;
    private String name;
    private String genre;               //genre changed to String

}





