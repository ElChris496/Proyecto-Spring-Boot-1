package com.infsis.Proyecto.Spring.Boot1.Models;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.List;

@Entity

public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String name;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "blog")
    private List<Article> articles;

    @OneToOne
    @JoinColumn(name ="userc_id")
    private Userc userc;

    @CreatedDate
    private LocalDateTime createdAt;

    public Blog(Integer id, String name, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
    }

    public Blog() {

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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
