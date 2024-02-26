package com.infsis.Proyecto.Spring.Boot1.Models;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Userc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String name;
    private String email;
    @CreatedDate
    private LocalDateTime createdAt;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "userc")
    private List<Article> articles;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name="userc_role",
            joinColumns = @JoinColumn(name = "userc_id"),
            inverseJoinColumns = @JoinColumn(name="role_id")
    )
    private List<Role> roles;

    @OneToOne(fetch = FetchType.EAGER)
    private Blog blog;


    public Userc(Integer id, String name, String email, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.createdAt = createdAt;
    }

    public Userc() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

}
