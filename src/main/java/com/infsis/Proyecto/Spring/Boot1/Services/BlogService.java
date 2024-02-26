package com.infsis.Proyecto.Spring.Boot1.Services;

import com.infsis.Proyecto.Spring.Boot1.DTOs.BlogDTO;

import java.util.Optional;

public interface BlogService {
    Optional<BlogDTO> getBlogById(Integer blogId);
    BlogDTO saveBlog (BlogDTO blogDTO);

    BlogDTO updateBlog(Integer blogId, BlogDTO blogDTO);
    void delete (Integer blogId);
}
