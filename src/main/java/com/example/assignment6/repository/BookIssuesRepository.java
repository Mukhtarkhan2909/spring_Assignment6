package com.example.assignment6.repository;

import com.example.assignment6.entity.BookIssues;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface BookIssuesRepository extends JpaRepository<BookIssues, Long> {
    @NotNull
    Optional<BookIssues> findById(Long id);
    @NotNull
    List<BookIssues> findAll();
}
