package com.infsis.Proyecto.Spring.Boot1.Controllers;

import com.infsis.Proyecto.Spring.Boot1.DTOs.BlogDTO;
import com.infsis.Proyecto.Spring.Boot1.Models.Blog;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @GetMapping()
    public ResponseEntity<BlogDTO> getBlogs(){
        BlogDTO blogDTO=new BlogDTO(1,"blog");
        return ResponseEntity.ok().body(blogDTO);
    }
    @GetMapping("/{id}")
    public ResponseEntity<BlogDTO> getBlog(@PathVariable Integer id){
        BlogDTO blogDTO=new BlogDTO(1,"blog");
        return ResponseEntity.ok().body(blogDTO);
    }
    @PostMapping()
    public ResponseEntity<BlogDTO> saveBlog(@RequestBody BlogDTO blogDTO){
        return ResponseEntity.ok().body(blogDTO);
    }
    @PutMapping("/{id}")
    public ResponseEntity<BlogDTO> updateBlog(@PathVariable Integer id, @RequestBody BlogDTO blogDTO){
        return ResponseEntity.ok().body(blogDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id){}
}
