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
public class Readers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String username;
    private String password;
    private String email;
    private String phone;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "readers")
    private List<BookRequests> bookRequests;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "readers")
    private List<Librarians> librarians;

    public Readers(String name, String username, String password, String email, String phone) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Readers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", bookRequests=" + bookRequests +
                '}';
    }
}
