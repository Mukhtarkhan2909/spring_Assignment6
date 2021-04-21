package com.example.assignment6.service;

import com.example.assignment6.entity.Readers;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Optional;

public interface ReaderService {

    void addReader(Readers readers);
    void updateReader(Readers readers);
    @NotNull
    Optional<Readers> getReaderById(Long id);
    List<Readers> findAllReaders();

}
