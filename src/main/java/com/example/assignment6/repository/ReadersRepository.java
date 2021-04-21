package com.example.assignment6.repository;

import com.example.assignment6.entity.Readers;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ReadersRepository extends JpaRepository<Readers, Long> {
    @NotNull
    Optional<Readers> findById(Long id);
    @NotNull
    List<Readers> findAll();
}
