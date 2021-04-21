package com.example.assignment6.service.impl;
import com.example.assignment6.entity.BookIssues;
import com.example.assignment6.repository.*;
import com.example.assignment6.service.BookIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BookIssueServiceImpl implements BookIssueService {

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
    public void addBookIssue(BookIssues bookIssues) {
        this.bookIssuesRepository.save(bookIssues);
    }

    @Override
    public void updateBookIssue(BookIssues bookIssues) {
        this.bookIssuesRepository.save(bookIssues);
    }

    @Override
    public Optional<BookIssues> getBookIssueById(Long id) {
        return this.bookIssuesRepository.findById(id);
    }

    @Override
    public List<BookIssues> findAllBookIssues() {
        return this.bookIssuesRepository.findAll();
    }
}
