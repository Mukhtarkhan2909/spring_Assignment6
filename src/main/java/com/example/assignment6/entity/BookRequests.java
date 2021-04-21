package com.example.assignment6.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class BookRequests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id", nullable = false)
    private Books books;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reader_id", nullable = false)
    private Readers readers;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "bookRequests")
    private BookIssues bookIssues;

    public BookRequests(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BookRequests{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", books=" + books +
                '}';
    }
}
