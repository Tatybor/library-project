package ru.ITGirl.library_project.DTO;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BookDTO {

    private Long id;
    private String name;
    private String genre;               //genre changed to String

}





