package ru.ITGirl.library_project.entity;
import jakarta.persistence.*;
import lombok.*;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Author {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @ManyToMany (mappedBy = "authors")
    private Set <Book> books;

}
