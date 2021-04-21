package com.example.assignment6.service;

import com.example.assignment6.entity.BookRequests;

import java.util.List;

public interface BookRequestService {

    void addBookRequest(BookRequests bookRequests);
    void updateBookRequest(BookRequests bookRequests);
    BookRequests getBookRequestById(Long id);
    List<BookRequests> findAllBookRequests();
}
