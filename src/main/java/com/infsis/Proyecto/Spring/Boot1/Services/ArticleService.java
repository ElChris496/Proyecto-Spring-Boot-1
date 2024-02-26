package com.infsis.Proyecto.Spring.Boot1.Services;

import com.infsis.Proyecto.Spring.Boot1.DTOs.ArticleDTO;

import java.util.Optional;

public interface ArticleService {
    Optional<ArticleDTO> getArticleById(Integer articleId);
    ArticleDTO saveArticle (ArticleDTO articleDTO);

    ArticleDTO updateArticle(Integer articleId, ArticleDTO articleDTO);
    void delete (Integer articleId);
}
