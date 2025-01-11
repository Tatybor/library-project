package ru.ITGirl.library_project.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AuthorDTO {
    private Long id;
    private String name;
    private String surname;

    private List<BookDTO> books;
}