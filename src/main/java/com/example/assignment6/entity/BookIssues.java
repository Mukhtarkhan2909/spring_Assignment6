package com.example.assignment6.entity;

import javax.persistence.*;
import java.sql.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class BookIssues {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Type(type = "date")
    private Date dueDate;
    @Type(type = "date")
    private Date dateOut;
    @Type(type = "date")
    private Date dateIn;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "librarian_id", nullable = false)
    private Librarians librarians;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "request_id", nullable = false)
    private BookRequests bookRequests;

    public BookIssues(Date dueDate, Date dateOut, Date dateIn) {
        this.dueDate = dueDate;
        this.dateOut = dateOut;
        this.dateIn = dateIn;
    }

    @Override
    public String toString() {
        return "BookIssues{" +
                "id=" + id +
                ", dueDate=" + dueDate +
                ", dateOut=" + dateOut +
                ", dateIn=" + dateIn +
                ", librarians=" + librarians +
                ", bookRequests=" + bookRequests +
                '}';
    }
}
