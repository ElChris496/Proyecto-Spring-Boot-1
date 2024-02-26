package com.infsis.Proyecto.Spring.Boot1.Models;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String reference;

    @ManyToOne()
    @JoinColumn(name="userc_id")
    private Userc userc;

    @ManyToOne()
    @JoinColumn(name="blog_id")
    private Blog blog;

    @CreatedDate
    private LocalDateTime createdAt;

    public Article(Integer id, String title, String reference, LocalDateTime createdAt) {
        this.id = id;
        this.title = title;
        this.reference = reference;
        this.createdAt = createdAt;
    }
    public Article(){

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
