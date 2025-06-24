package com.atividadeEad.atividadeEad.librarian;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "librarian")
public class Librarian {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "librarian_id", unique = true)
    private int librarianId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;


}
