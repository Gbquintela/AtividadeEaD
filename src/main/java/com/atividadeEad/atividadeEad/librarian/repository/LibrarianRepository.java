package com.atividadeEad.atividadeEad.librarian.repository;

import com.atividadeEad.atividadeEad.librarian.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrarianRepository extends JpaRepository<Librarian, Integer> {
}
