package com.example.assignment6.service.impl;

import com.example.assignment6.entity.Librarians;
import com.example.assignment6.entity.Readers;
import com.example.assignment6.repository.*;
import com.example.assignment6.service.LibrarianService;
import com.example.assignment6.service.ReaderService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibrarianServiceImpl implements LibrarianService {

    @Autowired
    private BookIssuesRepository bookIssuesRepository;
    @Autowired
    private BookRequestsRepository bookRequestsRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private LibrariansRepository librariansRepository;
    @Autowired
    private ReadersRepository readersRepository;

    @Override
    public void addLibrarian(Librarians librarians) {
        this.librariansRepository.save(librarians);
    }

    @Override
    public void updateLibrarian(Librarians librarians) {
        this.librariansRepository.save(librarians);
    }

    @Override
    @NotNull
    public Optional<Librarians> getLibrarianById(Long id) {
        return this.librariansRepository.findById(id);
    }

    @Override
    public List<Librarians> findAllLibrarians() {
        return this.librariansRepository.findAll();
    }
}
