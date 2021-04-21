package com.example.assignment6.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Librarians {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String username;
    private String password;
    private String email;
    private String phone;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "librarians")
    private List<BookIssues> bookIssues;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "LibrariansReaders",
            joinColumns = {@JoinColumn(name = "librarian_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "reader_id", referencedColumnName = "id")}
    )
    private List<Readers> readers;

    public Librarians(String name, String username, String password, String email, String phone) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Librarians{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", readers=" + readers +
                '}';
    }
}
