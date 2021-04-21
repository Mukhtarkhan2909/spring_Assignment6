package com.example.assignment6.entity;

import javax.persistence.*;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String isbn;
    private String name;
    private String author;
    private String description;
    private String category;
    private String publisher;
    private Boolean availability;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "books")
    private List<BookRequests> bookRequests;

    public Books(String isbn, String name, String author, String description, String category, String publisher, Boolean availability) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.description = description;
        this.category = category;
        this.publisher = publisher;
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", publisher='" + publisher + '\'' +
                ", availability=" + availability +
                '}';
    }
}
