package com.example.assignment6.service.impl;

import com.example.assignment6.entity.Readers;
import com.example.assignment6.repository.*;
import com.example.assignment6.service.ReaderService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ReaderServiceImpl implements ReaderService {

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
    public void addReader(Readers readers) {
        this.readersRepository.save(readers);
    }

    @Override
    public void updateReader(Readers readers) {
        this.readersRepository.save(readers);
    }

    @Override
    @NotNull
    public Optional<Readers> getReaderById(Long id) {
        return this.readersRepository.findById(id);
    }

    @Override
    public List<Readers> findAllReaders() {
        return this.readersRepository.findAll();
    }
}
