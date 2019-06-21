package com.blog.blog.project.controllers;
import com.blog.blog.project.Domain.BlogInfo;
import com.blog.blog.project.Domain.Blogrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainControllers {
  //@Autowired-- not needed wit the main controller constructor was added.

  private Blogrepo blogrepo;
  private List<BlogInfo> posts;

  public MainControllers(List<BlogInfo>posts, Blogrepo blogrepo){
    this.blogrepo = blogrepo;
    this.posts = posts;
  }
  @GetMapping("/")
    public String index(Model model){
    model.addAttribute("posts", posts);
      return "/index";
  }
  @GetMapping(value = "/blog_posts/new")
  public String newBlog(BlogInfo blogInfo){
    return "new";
  }

  @PostMapping(value = "/blog_posts/new")
  public String addNewBlogPost(BlogInfo blogInfo, Model model){
    blogrepo.save(blogInfo);
    posts.add(blogInfo);
    model.addAttribute("title", blogInfo.getTitle());
    model.addAttribute("author", blogInfo.getAuthor());
    model.addAttribute("blogEntry", blogInfo.getBlogEntry());
    return "result";
  }
  private void mirrorDB(){
    Iterable<BlogInfo> blogList = blogrepo.findAll();
    posts.clear();
    for(BlogInfo blog: blogList) {
    posts.add(blog);
    }
    }
 @DeleteMapping("/blog_posts/{id}/delete")
  public String deleteBlogInfo(@PathVariable("id")Long id){
            blogrepo.deleteById(id);
            mirrorDB();
            return "result";
 }
 @PutMapping("/blog_posts/{id}/edit")
  public String editBlogEntryPut(BlogInfo bp, Model model){
    blogrepo.save(bp);
    mirrorDB();
    model.addAttribute("title", bp.getTitle());
    model.addAttribute("author", bp.getAuthor());
    Model blogEntry = model.addAttribute("blogEntry", bp.getBlogEntry());
    return "result";
 }
 @GetMapping("blog_posts/{id}/edit")
  public String editBlogEntryView(@PathVariable("id")Long id, Model model){
   Optional<BlogInfo> optionalBlogInfo = blogrepo.findById(id);
   model.addAttribute("blogInfo", optionalBlogInfo.get());
   return "edit";
 }
}
