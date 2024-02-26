package com.infsis.Proyecto.Spring.Boot1.Services.implement;

import com.infsis.Proyecto.Spring.Boot1.DTOs.ArticleDTO;
import com.infsis.Proyecto.Spring.Boot1.DTOs.ArticleDTO;
import com.infsis.Proyecto.Spring.Boot1.Models.Article;
import com.infsis.Proyecto.Spring.Boot1.Services.ArticleService;

import java.util.Optional;

public class ArticleServiceImpl implements ArticleService {
    @Override
    public Optional<ArticleDTO> getArticleById(Integer articleId) {
        return Optional.empty();
    }

    @Override
    public ArticleDTO saveArticle(ArticleDTO articleDTO) {
        return null;
    }

    @Override
    public ArticleDTO updateArticle(Integer articleId, ArticleDTO articleDTO) {
        return null;
    }

    @Override
    public void delete(Integer articleId) {
    }
    private ArticleDTO ArticletoDto(Article article){
        ArticleDTO articleDTO=new ArticleDTO(
                article.getId(),
                article.getTitle(),
                article.getReference()
        );
        return articleDTO;
    }

    private Article DtoToArticle(ArticleDTO articleDTO) {
        Article article = new Article();
        article.setTitle(articleDTO.getTitle());
        article.setReference(articleDTO.getReference());

        return article;
    }
}
