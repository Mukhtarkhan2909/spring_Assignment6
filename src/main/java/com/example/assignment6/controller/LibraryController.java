package com.example.assignment6.controller;

import com.example.assignment6.entity.BookRequests;
import com.example.assignment6.entity.Books;
import com.example.assignment6.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import javax.annotation.PostConstruct;
import java.util.Locale;
import java.util.Scanner;

@Controller
public class LibraryController {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    @Autowired
    ReaderServiceImpl readerService;
    @Autowired
    BookServiceImpl bookService;
    @Autowired
    BookRequestServiceImpl bookLoanService;

    @PostConstruct
    public void mainMenu() {
        int choice = 0;
        while (choice != 3) {
            int i = 0;
            System.out.println("Choose your role" +
                    "\n1. Member" +
                    "\n2. Librarian" +
                    "\n3. Exit");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    memberMenu();
                    break;
                case 2:
                    librarianMenu();
                    break;
                case 3:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Incorrect choice");
            }
        }
    }

    public void memberMenu() {
        int choice = 0;
        System.out.println("Enter email address");
        String email = scan.next();
        System.out.println("Enter password");
        String password = scan.next();
        System.out.println("Choose operation" +
                "\n1. Search books" +
                "\n2. Return the book" +
                "\n3. Request for book" +
                "\n4. Show book availability" +
                "\n5. Back to main menu");
        choice = scan.nextInt();
        switch (choice) {
            case 1:
                searchBooks();
                break;
            case 2:
                System.out.println("Enter book id");
                break;
            case 3:
                System.out.println("Enter book id");
                break;
            case 4:
                System.out.println("Enter book id");
                break;
            case 5:
                mainMenu();
                break;
            default:
                System.out.println("Incorrect choice");
        }
    }

    public void librarianMenu() {
        int choice = 0;
        System.out.println("Enter email address");
        String email = scan.next();
        System.out.println("Enter password");
        String password = scan.next();
        System.out.println("Choose operation" +
                "\n1. Add new book" +
                "\n2. Issue the book" +
                "\n3. Show books" +
                "\n4. Back to main menu");
        choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter book isbn");
                String isbn = scan.next();
                System.out.println("Enter book name");
                String name = scan.next();
                System.out.println("Enter book author");
                String author = scan.next();
                System.out.println("Enter book description");
                String description = scan.next();
                System.out.println("Enter book category");
                String category = scan.next();
                System.out.println("Enter book publisher");
                String publisher = scan.next();
                Books books = new Books(isbn, name, author, description, category, publisher, true);
                bookService.addBook(books);
                break;
            case 2:
                System.out.println("Enter book id");
                break;
            case 3:
                showBooks();
                break;
            case 4:
                mainMenu();
                break;
            default:
                System.out.println("Incorrect choice");
        }
    }

    public void showBooks() {
        int choice = 0;
        System.out.println("Choose operation" +
                "\n1. Show all books" +
                "\n2. Show all issued books" +
                "\n3. Show all requested books" +
                "\n4. Show all books over due date" +
                "\n5. Back to librarians menu");
        choice = scan.nextInt();
        switch (choice) {
            case 1:
                for (Books book: bookService.getAllBooks()) {
                    System.out.println(book.toString());
                }
                break;
            case 2:
                for (BookRequests bookRequests : bookLoanService.findAllBookRequests()) {
                    System.out.println(bookRequests.toString());
                }
                break;
            case 3:
                showBooks();
                break;
            case 4:
                mainMenu();
                break;
            case 5:
                librarianMenu();
                break;
            default:
                System.out.println("Incorrect choice");
        }
    }

    public void searchBooks() {
        int choice = 0;
        System.out.println("Choose operation" +
                "\n1. Search books by name" +
                "\n2. Search books by author" +
                "\n3. Search books by description" +
                "\n4. Back to members menu");
        choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the book name");
                String name = scan.next();
                for (Books book: bookService.getBooksByName(name)) {
                    System.out.println(book.toString());
                }
                break;
            case 2:
                System.out.println("Enter the author name");
                String authorName = scan.next();
                for (Books book: bookService.getBooksByAuthor(authorName)) {
                    System.out.println(book.toString());
                }
                break;
            case 3:
                System.out.println("Enter the description");
                String description = scan.next();
                for (Books book: bookService.getBooksByDescription(description)) {
                    System.out.println(book.toString());
                }
                break;
            case 4:
                memberMenu();
                break;
            default:
                System.out.println("Incorrect choice");
        }
    }
}
