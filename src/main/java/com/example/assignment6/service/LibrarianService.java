package com.example.assignment6.service;

import com.example.assignment6.entity.Librarians;
import com.example.assignment6.entity.Readers;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Optional;

public interface LibrarianService {

    void addLibrarian(Librarians librarians);
    void updateLibrarian(Librarians readers);
    @NotNull
    Optional<Librarians> getLibrarianById(Long id);
    List<Librarians> findAllLibrarians();

}
