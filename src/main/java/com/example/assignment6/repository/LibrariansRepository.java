package com.example.assignment6.repository;

import com.example.assignment6.entity.Librarians;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LibrariansRepository extends JpaRepository<Librarians, Long> {
    Librarians findLibrariansById(Long id);
    @NotNull
    List<Librarians> findAll();
}
