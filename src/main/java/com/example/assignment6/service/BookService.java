package com.example.assignment6.service;

import com.example.assignment6.entity.Books;

import java.util.List;

public interface BookService {

    void addBook(Books books);
    void updateBook(Books books);
    Books getBookById(Long id);
    List<Books> getAllBooks();
    List<Books> getBooksByName(String name);
    List<Books> getBooksByAuthor(String author);
    List<Books> getBooksByCategory(String category);
    List<Books> getBooksByDescription(String description);

}
