package com.atividadeEad.atividadeEad.book.repository;

import com.atividadeEad.atividadeEad.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
