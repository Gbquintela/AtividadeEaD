package com.atividadeEad.atividadeEad.book;

import com.atividadeEad.atividadeEad.book.enums.Status;
import com.atividadeEad.atividadeEad.librarian.Librarian;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "livros")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id", unique = true)
    private int bookId;

    @Column
    private String title;

    @Column
    private String author;

    @Column
    private String gender;

    @Column
    private Status status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "librarian_id" )
    @OnDelete(action = OnDeleteAction.SET_NULL)
    private Librarian librarian;


}
