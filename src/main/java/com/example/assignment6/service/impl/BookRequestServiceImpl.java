package com.example.assignment6.service.impl;

import com.example.assignment6.entity.BookRequests;
import com.example.assignment6.repository.*;
import com.example.assignment6.service.BookRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookRequestServiceImpl implements BookRequestService {

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
    public void addBookRequest(BookRequests bookRequests) {
        this.bookRequestsRepository.save(bookRequests);
    }

    @Override
    public void updateBookRequest(BookRequests bookRequests) {
        this.bookRequestsRepository.save(bookRequests);
    }

    @Override
    public BookRequests getBookRequestById(Long id) {
        return this.bookRequestsRepository.findBookRequestsById(id);
    }

    @Override
    public List<BookRequests> findAllBookRequests() {
        return this.bookRequestsRepository.findAll();
    }
}
