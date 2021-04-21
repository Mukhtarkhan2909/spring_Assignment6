package com.example.assignment6.repository;

import com.example.assignment6.entity.BookRequests;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BookRequestsRepository extends JpaRepository<BookRequests, Long> {
    BookRequests findBookRequestsById(Long id);
    @NotNull
    List<BookRequests> findAll();
}
