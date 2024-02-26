package com.infsis.Proyecto.Spring.Boot1.Services.implement;

import com.infsis.Proyecto.Spring.Boot1.DTOs.BlogDTO;
import com.infsis.Proyecto.Spring.Boot1.Models.Blog;
import com.infsis.Proyecto.Spring.Boot1.Services.BlogService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService{
    @Override
    public Optional<BlogDTO> getBlogById(Integer blogId){return Optional.empty();}
    @Override
    public BlogDTO saveBlog(BlogDTO blogDTO) {
        return null;
    }

    @Override
    public BlogDTO updateBlog(Integer blogId, BlogDTO blogDTO) {
        return null;
    }

    @Override
    public void delete(Integer blogId) {
    }

    private BlogDTO BlogtoDto(Blog blog){
        BlogDTO blogDTO=new BlogDTO(
                blog.getId(),
                blog.getName()
        );
        return blogDTO;
    }

    private Blog DtoToBlog(BlogDTO blogDTO) {
        Blog blog = new Blog();
        blog.setName(blogDTO.getName());

        return blog;
    }
}
