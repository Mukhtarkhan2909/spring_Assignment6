package com.example.assignment6.service;

import com.example.assignment6.entity.BookIssues;

import java.util.List;
import java.util.Optional;

public interface BookIssueService {
    void addBookIssue(BookIssues bookIssues);
    void updateBookIssue(BookIssues bookIssues);
    Optional<BookIssues> getBookIssueById(Long id);
    List<BookIssues> findAllBookIssues();
}
